@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных 
тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age= age;
    this.result =result;// Инициализируй поля класса в конструкторе
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		{15,false},
        {22,true},
        {18,true},
        {21,true},
        // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	int age=21; // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про 
сообщение об ошибке
    assertEquals("Текст ошибки",true,isAdult);
	}
}
