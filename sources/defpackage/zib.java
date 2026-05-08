package defpackage;

import cfe.a;
import defpackage.cfe;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zib {
    public static final rw7 a = new rw7(lma.b, false);
    public static final rw7 b;
    public static final rw7 c;
    public static final LinkedHashMap d;

    static {
        lma lmaVar = lma.c;
        b = new rw7(lmaVar, false);
        c = new rw7(lmaVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        cfe cfeVar = new cfe();
        cfeVar.new a("java/util/".concat("Iterator")).a("forEachRemaining", null, new iib(strConcat4, 0));
        cfeVar.new a("java/lang/".concat("Iterable")).a("spliterator", null, new qu1(3));
        cfe.a aVar = cfeVar.new a("java/util/".concat("Collection"));
        aVar.a("removeIf", null, new zq0(1, strConcat2));
        aVar.a("stream", null, new mib(strConcat8, 1));
        aVar.a("parallelStream", null, new rib(strConcat8, 1));
        cfe.a aVar2 = cfeVar.new a("java/util/".concat("List"));
        aVar2.a("replaceAll", null, new sib(strConcat7, 1));
        aVar2.a("addFirst", "2.1", new wx2(strConcat, 1));
        aVar2.a("addLast", "2.1", new tib(strConcat, 1));
        aVar2.a("removeFirst", "2.1", new uib(strConcat, 1));
        aVar2.a("removeLast", "2.1", new vib(1, strConcat));
        cfe.a aVar3 = cfeVar.new a("java/util/".concat("LinkedList"));
        aVar3.a("addFirst", "2.1", new jib(strConcat, 0));
        aVar3.a("addLast", "2.1", new kib(strConcat, 0));
        aVar3.a("removeFirst", "2.1", new lib(strConcat, 0));
        aVar3.a("removeLast", "2.1", new mib(strConcat, 0));
        cfe.a aVar4 = cfeVar.new a("java/util/".concat("LinkedHashSet"));
        aVar4.a("addFirst", "2.2", new nib(strConcat, 0));
        aVar4.a("addLast", "2.2", new oib(strConcat, 0));
        aVar4.a("removeFirst", "2.2", new pib(strConcat, 0));
        aVar4.a("removeLast", "2.2", new qib(strConcat, 0));
        aVar4.a("getFirst", "2.2", new rib(strConcat, 0));
        aVar4.a("getLast", "2.2", new sib(strConcat, 0));
        cfe.a aVar5 = cfeVar.new a("java/util/".concat("Map"));
        aVar5.a("forEach", null, new tib(strConcat6, 0));
        aVar5.a("putIfAbsent", null, new uib(strConcat, 0));
        aVar5.a("replace", null, new vib(0, strConcat));
        int i = 1;
        aVar5.a("replace", null, new ez9(strConcat, 1));
        int i2 = 2;
        aVar5.a("replaceAll", null, new uq0(strConcat5, i2));
        aVar5.a("compute", null, new dp8(i, strConcat, strConcat5));
        aVar5.a("computeIfAbsent", null, new j4(i, strConcat, strConcat3));
        aVar5.a("computeIfPresent", null, new k4(i2, strConcat, strConcat5));
        aVar5.a("merge", null, new wib(strConcat, strConcat5));
        cfe.a aVar6 = cfeVar.new a("java/util/".concat("LinkedHashMap"));
        aVar6.a("putFirst", "2.2", new b00(strConcat, 4));
        aVar6.a("putLast", "2.2", new xib(strConcat));
        cfe.a aVar7 = cfeVar.new a(strConcat9);
        aVar7.a("empty", null, new ql2(strConcat9, 3));
        aVar7.a("of", null, new w04(1, strConcat, strConcat9));
        aVar7.a("ofNullable", null, new yib(strConcat, strConcat9));
        aVar7.a("get", null, new t4(strConcat, i2));
        aVar7.a("ifPresent", null, new oz3(strConcat4, 1));
        cfeVar.new a("java/lang/".concat("ref/Reference")).a("get", null, new iib(strConcat, 1));
        cfeVar.new a(strConcat2).a("test", null, new jib(strConcat, 1));
        cfeVar.new a("java/util/function/".concat("BiPredicate")).a("test", null, new kib(strConcat, 1));
        cfeVar.new a(strConcat4).a("accept", null, new lib(strConcat, 1));
        cfeVar.new a(strConcat6).a("accept", null, new nib(strConcat, 1));
        cfeVar.new a(strConcat3).a("apply", null, new oib(strConcat, 1));
        cfeVar.new a(strConcat5).a("apply", null, new pib(strConcat, 1));
        cfeVar.new a("java/util/function/".concat("Supplier")).a("get", null, new qib(strConcat, 1));
        d = cfeVar.a;
    }
}
