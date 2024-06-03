
import org.junit.jupiter.api.Test;

        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;

        public class SearchWebsite {

            public final String Website = "https://www.youtube.com/";

            public String URL (){
                return Website;
            }

            @Test
            void successfulSearchTest() {
                open(URL());
            }
        }
