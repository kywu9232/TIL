package javaExam;
public class ProductDTO {
		int prdNo;
		String prdName;
		int prdPrice;
		int prdYear;
		String prdMaker;
		public int getPrdNo() {
			return prdNo;
		}
		public void setPrdNo(int prdNo) {
			this.prdNo = prdNo;
		}
		public String getPrdName() {
			return prdName;
		}
		public void setPrdName(String prdName) {
			this.prdName = prdName;
		}
		public int getPrdPrice() {
			return prdPrice;
		}
		public void setPrdPrice(int prdPrice) {
			this.prdPrice = prdPrice;
		}
		public int getPrdYear() {
			return prdYear;
		}
		public void setPrdYear(int prdYear) {
			this.prdYear = prdYear;
		}
		public String getPrdMaker() {
			return prdMaker;
		}
		public void setPrdMaker(String prdMaker) {
			this.prdMaker = prdMaker;
		}
		public String toString(int prdNo,String prdName,int prdPrice,int prdYear, String prdMaker) {
			return prdNo + "\t"+ prdName + "\t" + prdPrice + "\t" + prdYear + "\t" + prdMaker ;
					
			
		}
}
