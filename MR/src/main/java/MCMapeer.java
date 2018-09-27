import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.json4s.jackson.Json;

import java.io.IOException;


public class MCMapeer extends Mapper <LongWritable,Text, Text,LongWritable>{
    private Text key1 = new Text();
    private LongWritable val = new LongWritable();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] strings = value.toString().split("");
        for(String str :strings){
            key1.set(str);
            val.set(1);
            context.write(key1,val);
        }
    }
}

