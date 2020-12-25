
public class OfficeEquip {
	Integer EqKey;
	String EqType;
	String EqName;
	String Eq—ond;
	
	public OfficeEquip(Integer pKey, String pName, String pType, String pCond)
	{
		EqKey = pKey;
		EqName = pName;
		EqType = pType;
		Eq—ond = pCond;
	}
	
	public static <A> void PrintInf(A a) {
		System.out.print(a);
	}
}
