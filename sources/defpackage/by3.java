package defpackage;

import android.database.Cursor;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import defpackage.mfd;
import defpackage.pm8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class by3 implements yx3, OnCompleteListener {
    public final Object a;
    public Object b;

    public by3(int i) {
        switch (i) {
            case 2:
                this.a = new j4a(new pm8[16]);
                break;
            case 3:
                this.a = new j4a(new Reference[16]);
                this.b = new ReferenceQueue();
                break;
            default:
                this.a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
                this.b = bArr;
                int i2 = 0;
                for (int i3 = 0; i3 < 128; i3++) {
                    bArr[i3] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.a;
                    if (i2 >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                    } else {
                        bArr[bArr2[i2]] = (byte) i2;
                        i2++;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [j4a] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void d(pm8 pm8Var) {
        if (pm8Var.D0 > 0) {
            if (pm8Var.u0.d == pm8.d.e && !pm8Var.F() && !pm8Var.G() && !pm8Var.E0 && pm8Var.k()) {
                e.c cVar = pm8Var.t0.f;
                if ((cVar.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                    while (cVar != null) {
                        if ((cVar.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                            ?? B = cVar;
                            ?? j4aVar = 0;
                            while (B != 0) {
                                if (B instanceof z96) {
                                    z96 z96Var = (z96) B;
                                    z96Var.n0(us3.d(z96Var, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
                                } else if ((B.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 && (B instanceof zs3)) {
                                    e.c cVar2 = ((zs3) B).e0;
                                    int i = 0;
                                    B = B;
                                    j4aVar = j4aVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                                            i++;
                                            j4aVar = j4aVar;
                                            if (i == 1) {
                                                B = cVar2;
                                            } else {
                                                if (j4aVar == 0) {
                                                    j4aVar = new j4a(new e.c[16]);
                                                }
                                                if (B != 0) {
                                                    j4aVar.b(B);
                                                    B = 0;
                                                }
                                                j4aVar.b(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.f;
                                        B = B;
                                        j4aVar = j4aVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                B = us3.b(j4aVar);
                            }
                        }
                        if ((cVar.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
                            break;
                        } else {
                            cVar = cVar.f;
                        }
                    }
                }
            }
            pm8Var.C0 = false;
            j4a<pm8> j4aVarN = pm8Var.N();
            pm8[] pm8VarArr = j4aVarN.a;
            int i2 = j4aVarN.c;
            for (int i3 = 0; i3 < i2; i3++) {
                d(pm8VarArr[i3]);
            }
        }
    }

    public static boolean e(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // defpackage.yx3
    public Object a(xx3 xx3Var, rga rgaVar) {
        return k13.a.a((xed) this.a, true, new ay3(this, xx3Var), rgaVar);
    }

    @Override // defpackage.yx3
    public ArrayList b(String str) throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT * FROM DeletedRecentSearch WHERE accountId = ? ORDER BY createdAt DESC LIMIT 100");
        mfdVarA.n(1, str);
        xed xedVar = (xed) this.a;
        xedVar.b();
        Cursor cursorI = pg8.I(xedVar, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "uid");
            int iB2 = r93.b(cursorI, "accountId");
            int iB3 = r93.b(cursorI, "whatQuery");
            int iB4 = r93.b(cursorI, "whereQuery");
            int iB5 = r93.b(cursorI, "searchTimestamp");
            int iB6 = r93.b(cursorI, "createdAt");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(new xx3(cursorI.getString(iB), cursorI.getString(iB2), cursorI.getString(iB3), cursorI.getString(iB4), cursorI.getLong(iB5), cursorI.getLong(iB6)));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    public void c(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = (byte[]) this.b;
        int length = str.length();
        while (length > 0 && e(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        while (i < length) {
            while (i < length && e(str.charAt(i))) {
                i++;
            }
            int i2 = i + 1;
            byte b = bArr[str.charAt(i)];
            while (i2 < length && e(str.charAt(i2))) {
                i2++;
            }
            int i3 = i2 + 1;
            byte b2 = bArr[str.charAt(i2)];
            if ((b | b2) < 0) {
                r40.h("invalid characters encountered in Hex string");
                return;
            } else {
                byteArrayOutputStream.write((b << 4) | b2);
                i = i3;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        h7h h7hVar = (h7h) this.a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        synchronized (h7hVar.f) {
            h7hVar.e.remove(taskCompletionSource);
        }
    }

    public by3(IndeedAppDatabase indeedAppDatabase) {
        this.a = indeedAppDatabase;
        this.b = new zx3(indeedAppDatabase, 0);
    }

    public /* synthetic */ by3(h7h h7hVar, TaskCompletionSource taskCompletionSource) {
        this.a = h7hVar;
        this.b = taskCompletionSource;
    }
}
