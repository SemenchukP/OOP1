public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 26;
        post.birthday.month =12;
        post.birthday.year =1979;
        post.name = "Павел";
        post.passport = "4444 № 44444444";
        post.patronymic = "Николаевич";
        post.phone = "+7(999)999-99-99";
        post.surname = "Семенчук";
        post.subscription = "true";
    }
}
