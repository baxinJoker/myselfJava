package log4j;
import org.apache.log4j.*;

public class Log4jTest { //��־���
	static Logger logger = Logger.getLogger(Log4jTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BasicConfigurator.configure();
//		logger.setLevel(Level.DEBUG);
//		logger.trace("������Ϣ");
//        logger.debug("������Ϣ");
//        logger.info("�����Ϣ");
//        try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        logger.warn("������Ϣ");
//        logger.error("������Ϣ");
//        logger.fatal("������Ϣ");
		PropertyConfigurator.configure("D:\\eclipse-workspace\\icoom\\src\\log4j.xml");
		for (int i = 0; i < 5000; i++) {
            logger.trace("������Ϣ");
            logger.debug("������Ϣ");
            logger.info("�����Ϣ");
            logger.warn("������Ϣ");
            logger.error("������Ϣ");
            logger.fatal("������Ϣ");
        }
	}

}
