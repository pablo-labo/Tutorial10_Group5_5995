package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import defpackage.xi6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends xi6 {
    public static final c n;
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    public final androidx.media3.common.a j;
    public final List<androidx.media3.common.a> k;
    public final Map<String, String> l;
    public final List<DrmInitData> m;

    public static final class a {
        public final Uri a;
        public final androidx.media3.common.a b;
        public final String c;

        public a(Uri uri, androidx.media3.common.a aVar, String str) {
            this.a = uri;
            this.b = aVar;
            this.c = str;
        }
    }

    public static final class b {
        public final Uri a;
        public final androidx.media3.common.a b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, androidx.media3.common.a aVar, String str, String str2, String str3, String str4) {
            this.a = uri;
            this.b = aVar;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        n = new c("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, androidx.media3.common.a aVar, List<androidx.media3.common.a> list7, boolean z, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = list2.get(i).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = aVar;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((a) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i3);
                    if (streamKey.b == i && streamKey.c == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.wb5
    public final xi6 a(List list) {
        ArrayList arrayListC = c(this.e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new c(this.a, this.b, arrayListC, list2, c(this.g, 1, list), c(this.h, 2, list), list2, this.j, this.k, this.c, this.l, this.m);
    }
}
