//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * @author Shiwen Li CN116237626
 * @since 5/11/2023 15:50
 */
public class java_2437_numberOfValidTimes {

//	private static final Logger logger = LoggerFactory.getLogger(java_2437_numberOfValidTimes.class);

	public static void main(String[] args) {
		java_2437_numberOfValidTimes o = new java_2437_numberOfValidTimes();
		System.out.println(o.countTime("?5:00"));
	}

	public int countTime(String time) {

		char[] chars = time.toCharArray();

		int hourCases;
		if (chars[0]=='?') {
			if (chars[1]=='?') {
				hourCases=24;//2
			} else {
				if (chars[1] <= '3') {
					hourCases = 3;
				} else {
					hourCases = 2;
				}
			}
		} else {
			if (chars[1]=='?') {
				if (chars[0]=='2'){
					hourCases=4;
				} else {
					hourCases=10;
				}
			} else {
				hourCases=1;//0
			}
		}

		int minuteCases;
		if (chars[3]=='?') {
			if (chars[4]=='?') {
				minuteCases=60;
			} else {
				minuteCases=6;
			}
		} else {
			if (chars[4]=='?') {
				minuteCases=10;
			} else {
				minuteCases=1;
			}
		}

		return hourCases * minuteCases;
	}

	public int countTimes(String time) {
		return 0;
	}

}
