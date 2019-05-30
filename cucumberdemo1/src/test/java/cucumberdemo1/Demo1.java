package cucumberdemo1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features/square.feature",dryRun=true,monochrome=true)
public class Demo1 {



}
