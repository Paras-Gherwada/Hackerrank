import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'acmTeam' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY topic as parameter.
     */

    public static List<Integer> acmTeam(List<String> topic) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        
        String topic_1, topic_2;
        int t_size = topic.get(0).length(), total_subjects_known;
        for(int attendee_1 = 0; attendee_1 < topic.size() - 1; ++attendee_1) {
            for(int attendee_2 = attendee_1 + 1; attendee_2 < topic.size(); ++attendee_2) {
                topic_1 = topic.get(attendee_1);
                topic_2 = topic.get(attendee_2);
                
                total_subjects_known = 0;
                for(int idx = 0; idx < t_size; ++idx)
                    if(topic_1.charAt(idx) == '1' || topic_2.charAt(idx) == '1')
                        ++total_subjects_known;
                
                if(result.get(0) == total_subjects_known)
                    result.set(1, result.get(1) + 1);
                
                if(result.get(0) < total_subjects_known) {
                    result.set(0, total_subjects_known);
                    result.set(1, 1);
                }
            }
        }
        
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
