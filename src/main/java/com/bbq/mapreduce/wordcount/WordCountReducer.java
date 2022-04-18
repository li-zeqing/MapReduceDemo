package com.bbq.mapreduce.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * @author Zeqing Li Email:lizeqing77@163.com
 * @Description
 * @date 2022-04-18 15:18
 */

/**
 * KEYIN, reducer阶段输入的key的类型：Text
 * VALUEIN, reducer阶段输入的value的类型：IntWritable
 * KEYOUT, reducer阶段输出的key的类型：Text
 * VALUEOUT, reducer阶段输出的value的类型：IntWritable
 */
public class WordCountReducer extends Reducer<Text, IntWritable,Text,IntWritable> {



}
