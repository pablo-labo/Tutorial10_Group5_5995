package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class db1 {
    public final ype a;

    public static final class a extends mj8 implements Function1<String, j6g> {
        final /* synthetic */ yqf $transaction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yqf yqfVar) {
            super(1);
            this.$transaction = yqfVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            String str2 = str;
            str2.getClass();
            this.$transaction.e.add(str2);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<String, j6g> {
        final /* synthetic */ Set<String> $tableKeys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LinkedHashSet linkedHashSet) {
            super(1);
            this.$tableKeys = linkedHashSet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            String str2 = str;
            str2.getClass();
            this.$tableKeys.add(str2);
            return j6g.a;
        }
    }

    public db1(z90 z90Var) {
        z90Var.getClass();
        this.a = z90Var;
    }

    public final void a(Function1 function1, int i) {
        ype ypeVar = this.a;
        yqf yqfVarV0 = ypeVar.V0();
        if (yqfVarV0 != null) {
            if (yqfVarV0.d.add(Integer.valueOf(i))) {
                function1.invoke(new a(yqfVarV0));
            }
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            function1.invoke(new b(linkedHashSet));
            String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
            ypeVar.e1((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final <R> R b(yqf yqfVar, yqf yqfVar2, Throwable th, R r) throws Throwable {
        LinkedHashSet linkedHashSet = yqfVar.d;
        ArrayList arrayList = yqfVar.c;
        ArrayList arrayList2 = yqfVar.b;
        LinkedHashSet linkedHashSet2 = yqfVar.e;
        boolean z = yqfVar.f;
        boolean z2 = false;
        if (yqfVar2 != null) {
            if (z && yqfVar.g) {
                z2 = true;
            }
            yqfVar2.g = z2;
            yqfVar2.b.addAll(arrayList2);
            yqfVar2.c.addAll(arrayList);
            yqfVar2.d.addAll(linkedHashSet);
            yqfVar2.e.addAll(linkedHashSet2);
        } else if (z && yqfVar.g) {
            if (!linkedHashSet2.isEmpty()) {
                String[] strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                this.a.e1((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            linkedHashSet2.clear();
            linkedHashSet.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((gu5) it.next()).invoke();
            }
            arrayList2.clear();
        } else {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((gu5) it2.next()).invoke();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                if (th == null) {
                    throw th2;
                }
                StringBuilder sb = new StringBuilder("Exception while rolling back from an exception.\nOriginal exception: ");
                sb.append(th);
                Throwable cause = th.getCause();
                sb.append("\nwith cause ");
                sb.append(cause);
                sb.append("\n\nRollback exception: ");
                sb.append(th2);
                throw new Throwable(sb.toString(), th2);
            }
        }
        if (yqfVar2 == null && (th instanceof red)) {
            return (R) ((red) th).a();
        }
        if (th == null) {
            return r;
        }
        throw th;
    }
}
