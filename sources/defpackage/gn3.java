package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import defpackage.n83;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class gn3 implements s15, wxe {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gn3(int i) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new rnb("FrescoIoBoundExecutor"));
        executorServiceNewFixedThreadPool.getClass();
        this.a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i, new rnb("FrescoDecodeExecutor"));
        executorServiceNewFixedThreadPool2.getClass();
        this.b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i, new rnb("FrescoBackgroundExecutor"));
        executorServiceNewFixedThreadPool3.getClass();
        this.c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new rnb("FrescoLightWeightBackgroundExecutor"));
        executorServiceNewFixedThreadPool4.getClass();
        this.d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, new rnb("FrescoBackgroundExecutor"));
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        this.e = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // defpackage.wxe
    public int a(long j) {
        long[] jArr = (long[]) this.b;
        int iA = vjg.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.s15
    public ExecutorService b() {
        return (ExecutorService) this.d;
    }

    @Override // defpackage.s15
    public ExecutorService c() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.s15
    public ExecutorService d() {
        return (ExecutorService) this.b;
    }

    @Override // defpackage.wxe
    public List e(long j) {
        xuf xufVar = (xuf) this.a;
        Map map = (Map) this.c;
        HashMap map2 = (HashMap) this.d;
        HashMap map3 = (HashMap) this.e;
        ArrayList<Pair> arrayList = new ArrayList();
        xufVar.g(j, xufVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        xufVar.i(j, false, xufVar.h, treeMap);
        xufVar.h(j, map, map2, xufVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zuf zufVar = (zuf) map2.get(pair.first);
                zufVar.getClass();
                n83.a aVar = new n83.a();
                aVar.b = bitmapDecodeByteArray;
                aVar.a = null;
                aVar.h = zufVar.b;
                aVar.i = 0;
                aVar.e = zufVar.c;
                aVar.f = 0;
                aVar.g = zufVar.e;
                aVar.l = zufVar.f;
                aVar.m = zufVar.g;
                aVar.p = zufVar.j;
                arrayList2.add(aVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zuf zufVar2 = (zuf) map2.get(entry.getKey());
            zufVar2.getClass();
            n83.a aVar2 = (n83.a) entry.getValue();
            CharSequence charSequence = aVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (vx3 vx3Var : (vx3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vx3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(vx3Var), spannableStringBuilder.getSpanEnd(vx3Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = zufVar2.c;
            int i9 = zufVar2.d;
            aVar2.e = f;
            aVar2.f = i9;
            aVar2.g = zufVar2.e;
            aVar2.h = zufVar2.b;
            aVar2.l = zufVar2.f;
            float f2 = zufVar2.i;
            int i10 = zufVar2.h;
            aVar2.k = f2;
            aVar2.j = i10;
            aVar2.p = zufVar2.j;
            arrayList2.add(aVar2.a());
        }
        return arrayList2;
    }

    @Override // defpackage.wxe
    public long f(int i) {
        return ((long[]) this.b)[i];
    }

    @Override // defpackage.s15
    public ExecutorService g() {
        return (ExecutorService) this.c;
    }

    @Override // defpackage.s15
    public ExecutorService h() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.s15
    public ExecutorService i() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.wxe
    public int m() {
        return ((long[]) this.b).length;
    }

    public gn3(xuf xufVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = xufVar;
        this.d = map2;
        this.e = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        xufVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.b = jArr;
    }
}
