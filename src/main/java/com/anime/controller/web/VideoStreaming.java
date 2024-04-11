package com.anime.controller.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/streamvideo" })
public class VideoStreaming extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String videoPath = getServletContext().getRealPath("/videos/2.mp4");
        File videoFile = new File(videoPath);
        FileInputStream fis = null;
        ServletOutputStream sos = null;

        try {
            fis = new FileInputStream(videoFile);
            String mimeType = getServletContext().getMimeType(videoPath);
            response.setContentType(mimeType != null ? mimeType : "video/mp4");
            response.setContentLength((int) videoFile.length());
            response.setHeader("Content-Disposition", "inline; filename=" + videoFile.getName() + "");

            // Buffer size to control the chunk size sent in response.
            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            sos = response.getOutputStream();
            while ((bytesRead = fis.read(buffer)) != -1) {
                sos.write(buffer, 0, bytesRead);
            }
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (sos != null) {
                sos.flush();
                sos.close();
            }
        }
    }
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


}
}
