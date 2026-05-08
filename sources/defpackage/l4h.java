package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l4h {

    public static final class a implements Function2<String, Boolean, j6g> {
        public final /* synthetic */ List<sjb> a;
        public final /* synthetic */ int b;
        public final /* synthetic */ g4a<List<sjb>> c;

        public a(List<sjb> list, int i, g4a<List<sjb>> g4aVar) {
            this.a = list;
            this.b = i;
            this.c = g4aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(String str, Boolean bool) {
            Object next;
            String str2 = str;
            boolean zBooleanValue = bool.booleanValue();
            str2.getClass();
            g4a<List<sjb>> g4aVar = this.c;
            List<sjb> value = g4aVar.getValue();
            Iterator<T> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((sjb) next).a.equals(str2)) {
                    break;
                }
            }
            sjb sjbVar = (sjb) next;
            if (sjbVar != null) {
                if (!zBooleanValue) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : value) {
                        if (!((sjb) obj).a.equals(sjbVar.a)) {
                            arrayList.add(obj);
                        }
                    }
                    value = arrayList;
                } else if (value.size() < this.b) {
                    value = z92.g1(sjbVar, value);
                }
            }
            g4aVar.setValue(value);
            return j6g.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ int b;
        public final /* synthetic */ List c;
        public final /* synthetic */ g4a d;

        public c(List list, int i, List list2, g4a g4aVar) {
            this.a = list;
            this.b = i;
            this.c = list2;
            this.d = g4aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
        @Override // defpackage.xu5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g j(defpackage.xo8 r9, java.lang.Integer r10, androidx.compose.runtime.b r11, java.lang.Integer r12) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l4h.c.j(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.util.List<defpackage.sjb> r33, final java.util.List<defpackage.sjb> r34, final java.lang.String r35, final java.lang.String r36, final java.lang.String r37, final java.lang.String r38, final int r39, final kotlin.jvm.functions.Function1<? super java.util.List<defpackage.sjb>, defpackage.j6g> r40, final defpackage.gu5<defpackage.j6g> r41, final defpackage.b5g r42, androidx.compose.runtime.b r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4h.a(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function1, gu5, b5g, androidx.compose.runtime.b, int):void");
    }
}
