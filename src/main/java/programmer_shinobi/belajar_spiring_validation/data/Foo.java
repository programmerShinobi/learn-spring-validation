package programmer_shinobi.belajar_spiring_validation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import programmer_shinobi.belajar_spiring_validation.validation.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {

    @Palindrome
    private String bar;

}
