package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wc8 {
    public static final LinkedHashSet a = bbe.p(q92.u("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;
    public static final LinkedHashSet g;

    static {
        List<md8> listA0 = u63.a0(md8.BOOLEAN, md8.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (md8 md8Var : listA0) {
            String strC = md8Var.m().a.f().c();
            strC.getClass();
            String[] strArr = {md8Var.f() + "Value()" + md8Var.e()};
            String strConcat = "java/lang/".concat(strC);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + JwtParser.SEPARATOR_CHAR + str);
            }
            w92.w0(linkedHashSet, linkedHashSet2);
        }
        b = bbe.o(bbe.o(bbe.o(bbe.o(bbe.o(bbe.o(linkedHashSet, q92.u("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), q92.t("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), q92.t("Double", "isInfinite()Z", "isNaN()Z")), q92.t("Float", "isInfinite()Z", "isNaN()Z")), q92.t("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), q92.t("CharSequence", "isEmpty()Z"));
        c = q92.u("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        d = bbe.o(bbe.o(bbe.o(bbe.o(bbe.o(bbe.o(q92.t("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), q92.u("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), q92.t("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), q92.t("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), q92.u("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), q92.u("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), q92.u("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        e = bbe.o(bbe.o(q92.u("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), q92.u("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), q92.u("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        md8 md8Var2 = md8.BOOLEAN;
        md8 md8Var3 = md8.BYTE;
        List listA02 = u63.a0(md8Var2, md8Var3, md8.DOUBLE, md8.FLOAT, md8Var3, md8.INT, md8.LONG, md8.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listA02.iterator();
        while (it.hasNext()) {
            String strC2 = ((md8) it.next()).m().a.f().c();
            strC2.getClass();
            String[] strArrH = q92.h("Ljava/lang/String;");
            w92.w0(linkedHashSet3, q92.t(strC2, (String[]) Arrays.copyOf(strArrH, strArrH.length)));
        }
        String[] strArrH2 = q92.h("D");
        LinkedHashSet linkedHashSetO = bbe.o(linkedHashSet3, q92.t("Float", (String[]) Arrays.copyOf(strArrH2, strArrH2.length)));
        String[] strArrH3 = q92.h("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = bbe.o(linkedHashSetO, q92.t("String", (String[]) Arrays.copyOf(strArrH3, strArrH3.length)));
        String[] strArrH4 = q92.h("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = q92.t("Throwable", (String[]) Arrays.copyOf(strArrH4, strArrH4.length));
    }
}
