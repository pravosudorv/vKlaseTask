package by.htp.task1;

public class Test {
	public static void main(String[] args) {
		Student[] baza = new Student[6];
		
		baza[0] = new Student("1912", "Иванов","Ивек","ыдоа", 19121988 , "Информатики","4","и4");
		baza[1] = new Student("1975", "вдыод","ффпфпфп","фпфп", 12011985, "Информатики","4","и4");
		baza[2] = new Student("1712", "всаоваол","врво","врвр", 30021989, "Мат","2","м2");
		baza[3] = new Student("15612", "ыпып","ыпып","ыпып", 30051990, "Информатики","2","и2");
		baza[4] = new Student("986512", "паоа","ыврпвр","врврв", 22011984, "Мат","1","м1");
		baza[5] = new Student("789512", "ввп","врв","врвр", 22111985, "Рус","5","р5");
		
		
		Secretar.sortVuvodGR(baza, 1988);
	}

	
}
