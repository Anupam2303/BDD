package Transfomation;

import cucumber.api.Transformer;

public class EmailTransform extends Transformer {
    @Override
    public String transform(String domainName) {

        return domainName.concat("@cerner.com");
    }
}
