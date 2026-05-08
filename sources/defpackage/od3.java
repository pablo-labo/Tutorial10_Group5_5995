package defpackage;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class od3 implements wb5<od3> {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final ql0 i;
    public final j8e j;
    public final Uri k;
    public final q2c l;
    public final List<d8b> m;

    public od3(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, q2c q2cVar, ql0 ql0Var, j8e j8eVar, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = q2cVar;
        this.i = ql0Var;
        this.k = uri;
        this.j = j8eVar;
        this.m = arrayList;
    }

    @Override // defpackage.wb5
    public final od3 a(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i >= this.m.size()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).a != i) {
                long jC = c(i);
                if (jC != -9223372036854775807L) {
                    j2 += jC;
                }
            } else {
                d8b d8bVarB = b(i);
                List<ea> list2 = d8bVarB.c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.b;
                    ea eaVar = list2.get(i3);
                    List<l3d> list3 = eaVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(streamKey.c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.a != i2) {
                            break;
                        }
                    } while (streamKey.b == i3);
                    j = j2;
                    arrayList2.add(new ea(eaVar.a, eaVar.b, arrayList3, eaVar.d, eaVar.e, eaVar.f));
                    if (streamKey.a != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new d8b(d8bVarB.a, d8bVarB.b - j, arrayList2, d8bVarB.d));
                j2 = j;
            }
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new od3(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final d8b b(int i) {
        return this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List<d8b> list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = list.get(i).b;
        } else {
            j = list.get(i + 1).b;
            j2 = list.get(i).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return vjg.O(c(i));
    }
}
