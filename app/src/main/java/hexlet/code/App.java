package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
// import picocli.CommandLine.Option;
// import picocli.CommandLine.Parameters;
import java.util.concurrent.Callable;

@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff v.1.0", description = "Compares two configuration files and shows a difference.")
public class App implements Callable<Integer> {
    @Override
    public Integer call() throws Exception { // your business logic goes here...
        // byte[] fileContents = Files.readAllBytes(file.toPath());
        // byte[] digest = MessageDigest.getInstance(algorithm).digest(fileContents);
        // System.out.printf("%0" + (digest.length*2) + "x%n", new BigInteger(1,
        // digest));
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
