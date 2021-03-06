package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A lazily generated row ordering comparator.
 */
public  class LazilyGeneratedOrdering implements scala.math.Ordering<org.apache.spark.sql.catalyst.InternalRow>, com.esotericsoftware.kryo.KryoSerializable {
  /**
   * Creates a {@link LazilyGeneratedOrdering} for the given schema, in natural ascending order.
   * @param schema (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.codegen.LazilyGeneratedOrdering forSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public abstract  boolean equals (Object x$1)  ;
  static public  java.util.Comparator<T> reversed ()  { throw new RuntimeException(); }
  static public  java.util.Comparator<T> thenComparing (java.util.Comparator<? super T> x$1)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> java.util.Comparator<T> thenComparing (java.util.function.Function<? super T, ? extends U> x$1, java.util.Comparator<? super U> x$2)  { throw new RuntimeException(); }
  static public <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing (java.util.function.Function<? super T, ? extends U> x$1)  { throw new RuntimeException(); }
  static public  java.util.Comparator<T> thenComparingInt (java.util.function.ToIntFunction<? super T> x$1)  { throw new RuntimeException(); }
  static public  java.util.Comparator<T> thenComparingLong (java.util.function.ToLongFunction<? super T> x$1)  { throw new RuntimeException(); }
  static public  java.util.Comparator<T> thenComparingDouble (java.util.function.ToDoubleFunction<? super T> x$1)  { throw new RuntimeException(); }
  static public  scala.Some<java.lang.Object> tryCompare (T x, T y)  { throw new RuntimeException(); }
  static public  boolean lteq (T x, T y)  { throw new RuntimeException(); }
  static public  boolean gteq (T x, T y)  { throw new RuntimeException(); }
  static public  boolean lt (T x, T y)  { throw new RuntimeException(); }
  static public  boolean gt (T x, T y)  { throw new RuntimeException(); }
  static public  boolean equiv (T x, T y)  { throw new RuntimeException(); }
  static public  T max (T x, T y)  { throw new RuntimeException(); }
  static public  T min (T x, T y)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> reverse ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> scala.math.Ordering<U> on (scala.Function1<U, T> f)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T>.Ops mkOrderingOps (T lhs)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> ordering ()  { throw new RuntimeException(); }
  // not preceding
  public   LazilyGeneratedOrdering (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> ordering)  { throw new RuntimeException(); }
  public   LazilyGeneratedOrdering (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> ordering, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  int compare (org.apache.spark.sql.catalyst.InternalRow a, org.apache.spark.sql.catalyst.InternalRow b)  { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output out)  { throw new RuntimeException(); }
  public  void read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input in)  { throw new RuntimeException(); }
}
