package log4j;
import org.apache.log4j.*;

public class Log4jTest { //日志输出
	static Logger logger = Logger.getLogger(Log4jTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BasicConfigurator.configure();
//		logger.setLevel(Level.DEBUG);
//		logger.trace("跟踪信息");
//        logger.debug("调试信息");
//        logger.info("输出信息");
//        try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        logger.warn("警告信息");
//        logger.error("错误信息");
//        logger.fatal("致命信息");
		PropertyConfigurator.configure("D:\\eclipse-workspace\\icoom\\src\\log4j.xml");
		for (int i = 0; i < 5000; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
	}

}
