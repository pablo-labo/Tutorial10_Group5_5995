package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class en5 implements Comparator {
    public static final en5 b = new en5(0);
    public final /* synthetic */ int a;

    public /* synthetic */ en5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj2;
                if (!dn5.d(focusTargetNode) || !dn5.d(focusTargetNode2)) {
                    if (dn5.d(focusTargetNode)) {
                        return -1;
                    }
                    return dn5.d(focusTargetNode2) ? 1 : 0;
                }
                pm8 pm8VarF = us3.f(focusTargetNode);
                pm8 pm8VarF2 = us3.f(focusTargetNode2);
                if (wl7.b(pm8VarF, pm8VarF2)) {
                    return 0;
                }
                Object[] objArr = new pm8[16];
                int i = 0;
                while (pm8VarF != null) {
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                    }
                    objArr[0] = pm8VarF;
                    i++;
                    pm8VarF = pm8VarF.K();
                }
                Object[] objArr3 = new pm8[16];
                int i3 = 0;
                while (pm8VarF2 != null) {
                    int i4 = i3 + 1;
                    if (objArr3.length < i4) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i3 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                    }
                    objArr3[0] = pm8VarF2;
                    i3++;
                    pm8VarF2 = pm8VarF2.K();
                }
                int iMin = Math.min(i - 1, i3 - 1);
                if (iMin >= 0) {
                    int i5 = 0;
                    while (wl7.b(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return wl7.c(((pm8) objArr[i5]).L(), ((pm8) objArr3[i5]).L());
                }
                r6.g("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            default:
                pxc pxcVar = te8.a;
                Integer numB = d04.b((e04) obj, (e04) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}
