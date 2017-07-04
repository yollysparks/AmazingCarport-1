/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DomainServices;



/**
 *
 * @author ivoni
 */
public class SVGCreator {

    int length;
    int width;
    StringBuilder res = new StringBuilder();
    StringBuilder res1 = new StringBuilder();

    public SVGCreator(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public String getTop() {
        int divisions = length / 8;
        res1.append("<svg width=\"640\" height=\"480\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:svg=\"http://www.w3.org/2000/svg\">\n"
                + " <!-- Created with SVG-edit - http://svg-edit.googlecode.com/ -->\n"
                + " <g>\n"
                + "  <title>Layer 1</title>\n"
                + "  <rect fill=\"#ffffff\" stroke=\"#000000\" x=\"33\" y=\"62\" width=\"539\" height=\"349\" id=\"svg_1\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"91\" y1=\"60\" x2=\"91\" y2=\"409\" id=\"svg_2\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"431\" y1=\"62.5\" x2=\"431\" y2=\"411.5\" id=\"svg_3\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"359\" y1=\"64.5\" x2=\"359\" y2=\"413.5\" id=\"svg_4\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"289\" y1=\"60.5\" x2=\"289\" y2=\"409.5\" id=\"svg_5\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"218\" y1=\"58.5\" x2=\"218\" y2=\"407.5\" id=\"svg_6\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"156\" y1=\"59.5\" x2=\"156\" y2=\"408.5\" id=\"svg_7\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" x1=\"500\" y1=\"63.5\" x2=\"500\" y2=\"412.5\" id=\"svg_10\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"30\" y1=\"128\" x2=\"570\" y2=\"127\" id=\"svg_11\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"30.5\" y1=\"231.5\" x2=\"570\" y2=\"230.5\" id=\"svg_12\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"31.5\" y1=\"96.5\" x2=\"570.5\" y2=\"95.5\" id=\"svg_13\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"31.5\" y1=\"371.5\" x2=\"570\" y2=\"370.5\" id=\"svg_14\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"30.5\" y1=\"335.5\" x2=\"570\" y2=\"334.5\" id=\"svg_15\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"30.5\" y1=\"298.5\" x2=\"570\" y2=\"297.5\" id=\"svg_16\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"31.5\" y1=\"264.5\" x2=\"570\" y2=\"263.5\" id=\"svg_17\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"31.5\" y1=\"196.5\" x2=\"570\" y2=\"195.5\" id=\"svg_18\"/>\n"
                + "  <line fill=\"none\" stroke=\"#000000\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"30.5\" y1=\"162.5\" x2=\"570\" y2=\"161.5\" id=\"svg_19\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"34\" y1=\"14\" x1=\"34\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"570\" y1=\"14\" x1=\"571\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"500\" y1=\"14\" x1=\"500\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"432\" y1=\"14\" x1=\"432\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"359\" y1=\"14\" x1=\"359\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"289\" y1=\"14\" x1=\"289\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"218\" y1=\"14\" x1=\"218\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"156\" y1=\"14\" x1=\"156\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"VajnaLiniq\" stroke=\"#000000\" y2=\"50\" x2=\"91\" y1=\"14\" x1=\"91\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line stroke=\"#000000\" id=\"svg_8\" y2=\"412\" x2=\"600\" y1=\"64\" x1=\"598\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" fill=\"none\"/>\n"
                + "  <line id=\"svg_9\" y2=\"433\" x2=\"574\" y1=\"435\" x1=\"33\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"5\" stroke=\"#000000\" fill=\"none\"/>\n"
                + "  <text stroke=\"#000000\" transform=\"matrix(1.209363344658513,0,0,0.6872287336702881,-61.762513864487694,150.75466120350498) \" xml:space=\"preserve\" text-anchor=\"middle\" font-family=\"serif\" font-size=\"24\" id=\"svg_20\" y=\"454\" x=\"291\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"0\"").append(" fill=\\\"#000000\\\">").append(length).append("cm</text>\n"
                + "  <text transform=\"rotate(-88.60812377929688 616.15625,239.00000000000003) \" xml:space=\"preserve\" text-anchor=\"middle\" font-family=\"serif\" font-size=\"24\" id=\"svg_21\" y=\"247\" x=\"616\" stroke-linecap=\"null\" stroke-linejoin=\"null\" stroke-dasharray=\"null\" stroke-width=\"0\" stroke=\"#000000\"").append(" fill=\\\"#000000\\\">").append(width).append("cm</text>\n"
                + " </g>\n" + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"54\" y=\"30\" id=\"svg_23\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"850.41797\" y=\"30\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"svg_25\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"736.0419\" y=\"30\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"svg_26\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"609.89183\" y=\"30\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"svg_27\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"495.51576\" y=\"31.31306\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"svg_28\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"372.72969\" y=\"30\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"malukTekst\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"263.39963\" y=\"30\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"svg_30\">").append(divisions).append("cm</text>\n"
                + "  <text fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"157.43356\" y=\"30\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" transform=\"matrix(0.5945299764984213,0,0,0.8610760247684083,29.331354708624346,13.01313067789215) \" stroke=\"#000000\" id=\"svg_31\">").append(divisions).append("cm</text>\n"
                + "</svg>");
        return res1.toString();

    }

    public String drawSide() {
        int SVGWidth = length + 160;
        int roofWidth = length;
        int sideWidth = length - 20;
        int pole2X = 80 + length / 2;
        int pole3X = 80 + length - 30;
        int line2X2 = length + 80;
        int text2X = pole2X + 300;
        int text2Text = length;

        res.append("<svg width=\"").append(SVGWidth).append("\"height=\"480\"");
        res.append("xmlns=\"http://www.w3.org/2000/svg\" xmlns:svg=\"http://www.w3.org/2000/svg\">").append(" <g>\n"
                + "  <title>Layer 1</title>\n"
                + "  <rect fill=\"none\" stroke=\"rgb(0,0,0)\" y=\"25\" x=\"80\" height=\"15\" ");
        res.append("width=\"").append(roofWidth).append("\" id=\"roof\"/>\n"                    
                + "  <rect fill=\"none\" stroke=\"rgb(0,0,0)\" y=\"40\" x=\"90\" height=\"10\"");
        res.append("width=\"").append(sideWidth).append("\" id=\"side\"/>\n"
                + "  <rect fill=\"none\" stroke=\"rgb(0,0,0)\" y=\"40\" x=\"140\" height=\"215\" width=\"10\" id=\"pole_1\"/>");
        res.append("<rect fill=\"none\" stroke=\"rgb(0,0,0)\" y=\"40\" ").append("x=\"").append(pole2X).append("\"height=\"215\" width=\"10\" id=\"pole_2\"/>\n"
                + "  <rect fill=\"none\" stroke=\"rgb(0,0,0)\" y=\"40\" ").append("x=\"").append(pole3X).append("\" height=\"215\" width=\"10\" id=\"pole_3\"/>");
        res.append(" <line x1=\"40\" y1=\"25\" x2=\"40\" y2=\"250\" stroke-width=\"2\" stroke=\"rgb(255,0,0)\" id=\"height_line\"/>\n"
                + "  <text stroke=\"rgb(255,0,0)\" transform=\"matrix(0.5,0,0,0.5,2.5,70) \" fill=\"#000000\" stroke-width=\"0\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x=\"33\" y=\"135\" id=\"svg_1\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\">250 cm</text>");
        res.append(" <line fill=\"none\" stroke=\"rgb(255,0,0)\" stroke-width=\"null\" stroke-dasharray=\"null\" stroke-linejoin=\"null\" stroke-linecap=\"null\" x1=\"80\" y1=\"300\" ");
        res.append("x2=\"").append(line2X2).append("\" y2=\"300\" id=\"svg_2\"/>\n"
                + "  <text stroke=\"rgb(255,0,0)\" transform=\"matrix(0.5,0,0,0.5,2.5,70) \" fill=\"#000000\" stroke-width=\"0\" stroke-linejoin=\"null\" stroke-linecap=\"null\" ");
        res.append("x=\"").append(text2X).append("\" y=\"560\" font-size=\"24\" font-family=\"serif\" text-anchor=\"middle\" xml:space=\"preserve\" ");
        res.append("\"id=\"line_length\">").append(text2Text).append("\" cm</text>\n"
                + " </g>\n"
                + "</svg>");
        return res.toString();
    }
}




