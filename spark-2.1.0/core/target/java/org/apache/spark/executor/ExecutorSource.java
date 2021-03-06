package org.apache.spark.executor;
  class ExecutorSource implements org.apache.spark.metrics.source.Source {
  public   ExecutorSource (java.util.concurrent.ThreadPoolExecutor threadPool, java.lang.String executorId)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.hadoop.fs.FileSystem.Statistics> fileStats (java.lang.String scheme)  { throw new RuntimeException(); }
  private <T extends java.lang.Object> java.lang.Object registerFileSystemStat (java.lang.String scheme, java.lang.String name, scala.Function1<org.apache.hadoop.fs.FileSystem.Statistics, T> f, T defaultValue)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
}
