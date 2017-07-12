/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Facades;

import Business.DomainServices.CarportCalculator;
import Business.DomainServices.SVGCreator;
import Data.Connector;
import Data.CustomerMapper;
import Data.OrderMapper;
import Data.PartsMapper;

/**
 *
 * @author felesiah
 */
public class Carportfacade {
  CustomerMapper cm = new  CustomerMapper();
  OrderMapper om = new OrderMapper();
  PartsMapper pm= new PartsMapper();
  Connector con = new Connector();
  
  CarportCalculator calc = new CarportCalculator();
    public Carportfacade(int width, int length, boolean isFlat){
    }
    public Carportfacade() {}
    
    public PartsMapper showParts() throws Exception{
    pm.retrieveParts();
    pm.getList();
        return pm;  
    } 
    public int price(int length,int width){
      int priceAll  =  calc.calculatePrice(length,width);
      return  priceAll;
    }
    
    public String Draw(int width,int length){
    SVGCreator draw = new SVGCreator(width,length);
      String sketch1 = draw.drawSide();
      String sketch2 = draw.getTop();
      return "Sideview :" + sketch1  + sketch2 + "Topview: ";       
    }
    
    public OrderMapper Order() throws Exception{
//    om.getOrderByCustomerID(id);
      om.getOrders();
       return om;
    } 
    
    public CustomerMapper newCustomer(String email,String password,String firstName,String lastName,String address,String zip,String phone) throws Exception{   
     cm.createCustomer(email, password, firstName, lastName, address, zip, phone);   
      return cm;
    }
}
