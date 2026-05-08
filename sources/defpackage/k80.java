package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import androidx.emoji2.text.d;
import defpackage.le0;
import defpackage.pn5;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class k80 implements h3b {
    public final String a;
    public final tjf b;
    public final List<le0.c<? extends le0.a>> c;
    public final List<le0.c<sab>> d;
    public final pn5.a e;
    public final iy3 f;
    public final cb0 g;
    public final CharSequence h;
    public final dm8 i;
    public us1 j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0673  */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [foe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [lc1] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.util.List, java.util.List<? extends le0$c<? extends le0$a>>, java.util.List<le0$c<? extends le0$a>>] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [foe] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r5v8, types: [dl6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k80(java.lang.String r43, defpackage.tjf r44, java.util.List<? extends le0.c<? extends le0.a>> r45, java.util.List<le0.c<defpackage.sab>> r46, pn5.a r47, defpackage.iy3 r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k80.<init>(java.lang.String, tjf, java.util.List, java.util.List, pn5$a, iy3):void");
    }

    @Override // defpackage.h3b
    public final boolean a() {
        us1 us1Var = this.j;
        if (us1Var != null ? us1Var.a() : false) {
            return true;
        }
        if (!this.k) {
            vcb vcbVar = this.b.c;
            ko3 ko3Var = nq4.a;
            ko3 ko3Var2 = nq4.a;
            ese<Boolean> eseVarA = ko3Var2.a;
            if (eseVarA == null) {
                if (d.d()) {
                    eseVarA = ko3Var2.a();
                    ko3Var2.a = eseVarA;
                } else {
                    eseVarA = c0h.b0;
                }
            }
            if (eseVarA.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h3b
    public final float b() {
        return this.i.c();
    }

    @Override // defpackage.h3b
    public final float c() {
        dm8 dm8Var = this.i;
        float f = dm8Var.e;
        TextPaint textPaint = dm8Var.b;
        if (!Float.isNaN(f)) {
            return dm8Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = dm8Var.a;
        lineInstance.setText(new w22(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new cm8());
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.e()).intValue() - ((Number) pair.d()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                k20.p();
                return 0.0f;
            }
            Pair pair2 = (Pair) it.next();
            desiredWidth = Layout.getDesiredWidth(dm8Var.b(), ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(dm8Var.b(), ((Number) pair3.a()).intValue(), ((Number) pair3.b()).intValue(), textPaint));
            }
        }
        dm8Var.e = desiredWidth;
        return desiredWidth;
    }
}
