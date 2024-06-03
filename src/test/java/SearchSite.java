
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;

        public class SearchSite {

            @Test
            void successfulSearchTest() {
                open("https://www.youtube.com/");
            }
        }
