package expo.modules.kotlin.jni;

import defpackage.b0;
import defpackage.fh7;
import defpackage.h5;
import defpackage.k20;
import defpackage.nh7;
import defpackage.nic;
import defpackage.oh7;
import defpackage.s23;
import defpackage.t92;
import defpackage.ut0;
import defpackage.w92;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/jni/ExpectedType;", "", "", "getCombinedTypes", "()I", "", "Lexpo/modules/kotlin/jni/SingleType;", "getPossibleTypes", "()[Lexpo/modules/kotlin/jni/SingleType;", "getFirstType", "()Lexpo/modules/kotlin/jni/SingleType;", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpectedType {
    public final SingleType[] a;
    public final int b;

    public static final class a {
        public static ExpectedType a(s23 s23Var) {
            s23Var.getClass();
            return new ExpectedType(new SingleType(s23.b0, new ExpectedType[]{new ExpectedType(s23Var)}));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12, types: [expo.modules.kotlin.jni.SingleType] */
        public static ExpectedType b(ExpectedType... expectedTypeArr) {
            ArrayList arrayList = new ArrayList();
            for (ExpectedType expectedType : expectedTypeArr) {
                w92.w0(arrayList, ut0.d0(expectedType.a));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                s23 s23Var = ((SingleType) obj).a;
                Object arrayList2 = linkedHashMap.get(s23Var);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(s23Var, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                if (!it2.hasNext()) {
                    b0.u("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    SingleType singleType = (SingleType) it2.next();
                    next = (SingleType) next;
                    next.getClass();
                    singleType.getClass();
                    s23 s23Var2 = next.a;
                    s23 s23Var3 = singleType.a;
                    if (s23Var2 != s23Var3) {
                        h5.m("Cannot merge types with different CppType: ", s23Var2, " and ", s23Var3);
                        return null;
                    }
                    ExpectedType[] expectedTypeArr2 = next.b;
                    ExpectedType[] expectedTypeArr3 = singleType.b;
                    if (expectedTypeArr2 != null && expectedTypeArr3 != null) {
                        if (expectedTypeArr2.length != expectedTypeArr3.length) {
                            h5.k(k20.l("Cannot merge types with different number of parameters: ", expectedTypeArr2.length, expectedTypeArr3.length, " and "));
                            return null;
                        }
                        oh7 oh7VarH = nic.H(0, expectedTypeArr2.length);
                        ArrayList arrayList4 = new ArrayList(t92.r0(oh7VarH, 10));
                        Iterator<Integer> it3 = oh7VarH.iterator();
                        while (((nh7) it3).c) {
                            int iNextInt = ((fh7) it3).nextInt();
                            arrayList4.add(b(expectedTypeArr2[iNextInt], expectedTypeArr3[iNextInt]));
                        }
                        next = new SingleType(s23Var2, (ExpectedType[]) arrayList4.toArray(new ExpectedType[0]));
                    }
                }
                arrayList3.add((SingleType) next);
            }
            SingleType[] singleTypeArr = (SingleType[]) arrayList3.toArray(new SingleType[0]);
            return new ExpectedType((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
        }
    }

    public ExpectedType(s23... s23VarArr) {
        ArrayList arrayList = new ArrayList(s23VarArr.length);
        for (s23 s23Var : s23VarArr) {
            arrayList.add(new SingleType(s23Var, null));
        }
        SingleType[] singleTypeArr = (SingleType[]) arrayList.toArray(new SingleType[0]);
        this((SingleType[]) Arrays.copyOf(singleTypeArr, singleTypeArr.length));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExpectedType)) {
            return false;
        }
        SingleType[] singleTypeArr = this.a;
        int length = singleTypeArr.length;
        SingleType[] singleTypeArr2 = ((ExpectedType) obj).a;
        if (length != singleTypeArr2.length) {
            return false;
        }
        int length2 = singleTypeArr.length;
        for (int i = 0; i < length2; i++) {
            SingleType singleType = singleTypeArr[i];
            s23 s23Var = singleType.a;
            SingleType singleType2 = singleTypeArr2[i];
            if (s23Var != singleType2.a || !wl7.b(singleType, singleType2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: getCombinedTypes, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final SingleType getFirstType() {
        return (SingleType) ut0.j0(this.a);
    }

    /* JADX INFO: renamed from: getPossibleTypes, reason: from getter */
    public final SingleType[] getA() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public ExpectedType(SingleType... singleTypeArr) {
        this.a = singleTypeArr;
        int cppType = 0;
        for (SingleType singleType : singleTypeArr) {
            cppType |= singleType.getCppType();
        }
        this.b = cppType;
    }
}
