package by.htp.task1;

public class Test {
	public static void main(String[] args) {
		Student[] baza = new Student[6];
		
		baza[0] = new Student("1912", "������","����","����", 19121988 , "�����������","4","�4");
		baza[1] = new Student("1975", "�����","�������","����", 12011985, "�����������","4","�4");
		baza[2] = new Student("1712", "��������","����","����", 30021989, "���","2","�2");
		baza[3] = new Student("15612", "����","����","����", 30051990, "�����������","2","�2");
		baza[4] = new Student("986512", "����","������","�����", 22011984, "���","1","�1");
		baza[5] = new Student("789512", "���","���","����", 22111985, "���","5","�5");
		
		
		Secretar.sortVuvodGR(baza, 1988);
	}

	
}
