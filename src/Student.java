import java.lang.reflect.Field;

class Student implements Exam {

    private String name;

    @MaxGrade(100)
    private int score;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void takeExam(int score) throws FailGradeException {

        try {
            Field field = this.getClass().getDeclaredField("score");
            field.setAccessible(true);

            MaxGrade maxGrade = field.getAnnotation(MaxGrade.class);
            if (maxGrade != null && score > maxGrade.value()) {
                throw new FailGradeException("Score " + score + " exceeds maximum of " + maxGrade.value());
            }

            field.setInt(this, score);
            System.out.println( " scored: " + score);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
