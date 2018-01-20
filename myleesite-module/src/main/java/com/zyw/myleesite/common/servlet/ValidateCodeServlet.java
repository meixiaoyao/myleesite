package com.zyw.myleesite.common.servlet;

import com.zyw.myleesite.common.utils.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 生成随机验证码
 * <p>Title: ValidateCodeServlet </p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/20 下午 4:51
 */
public class ValidateCodeServlet extends HttpServlet {
    public static final String VALIDATE_CODE = "validateCode";

    private int w =70;
    private int h = 26;

    public ValidateCodeServlet(){
        super();
    }

    public void destroy(){
        super.destroy();
    }

    public static boolean validate(HttpServletRequest request, String validateCode){
        String code = (String)request.getSession().getAttribute(VALIDATE_CODE);
        return validateCode.toUpperCase().equals(code);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String validateCode = (String)request.getSession().getAttribute(VALIDATE_CODE);
        if(StringUtils.isNoneBlank(validateCode)){
            response.getOutputStream().print(validate(request, validateCode) ? "true" : "false");
        }else{
            this.doPost(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        createImage(request, response);
    }

    private void createImage(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setHeader("Param", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expries", 0);
        response.setContentType("image/jpeg");

        /*
		 * 得到参数高，宽，都为数字时，则使用设置高宽，否则使用默认值
		 */
        String width = request.getParameter("width");
        String height = request.getParameter("height");
        if(StringUtils.isNumeric(width) && StringUtils.isNumeric(height)){
            w = NumberUtils.toInt(width);
            h = NumberUtils.toInt(height);
        }

        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
        Graphics graphics = image.getGraphics();

        // 生成背景
        createBackground(graphics);

        // 生成字符
        String s = createCharacter(graphics);
        request.getSession().setAttribute(VALIDATE_CODE, s);

        graphics.dispose();
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "JPEG", out);
        out.close();
    }

    private Color getRandColor(int fc, int bc){
        int f = fc;
        int b =bc;
        Random random = new Random();
        if(f > 255){
            f = 255;
        }
        if(b > 255){
            b = 255;
        }
        return new Color(f+random.nextInt(b-f), f+random.nextInt(b-f), f+random.nextInt(b-f));
    }

    private void createBackground(Graphics g){
        // 填充背景
        g.setColor(getRandColor(220, 250));
        g.fillRect(0, 0, w, h);
        // 加干扰线
        for(int i = 0; i<8; i++){
            g.setColor(getRandColor(40, 150));
            Random random = new Random();
            int x = random.nextInt(w);
            int y = random.nextInt(h);
            int x1 = random.nextInt(w);
            int y1 = random.nextInt(h);
            g.drawLine(x, y, x1, y1);
        }
    }

    private String createCharacter(Graphics g){
        char[] codeSeq = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] fontTypes = {"Arial", "Arial Black", "AvantGarde Bk BT", "Calibri"};
        Random random = new Random();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<4; i++){
            String r = String.valueOf(codeSeq[random.nextInt(codeSeq.length)]);
            g.setColor(new Color(50+random.nextInt(100), 50+random.nextInt(100), 50+random.nextInt(100)));
            g.setFont(new Font(fontTypes[random.nextInt(fontTypes.length)], Font.BOLD, 26));
            g.drawString(r, 15*i+5, 19+random.nextInt(8));
            s.append(r);
        }
        return s.toString();
    }
}
