package androidx.media3.session;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.indeed.android.jobsearch.R;
import defpackage.b47;
import defpackage.e47;
import defpackage.gdb;
import defpackage.ka2;
import defpackage.qyc;
import defpackage.v8e;
import defpackage.vjg;
import defpackage.w8e;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final v8e a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final b47 h;
    public final boolean i;

    static {
        String str = vjg.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
        r = Integer.toString(8, 36);
    }

    public a(v8e v8eVar, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, b47 b47Var) {
        this.a = v8eVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = b47Var;
    }

    public static boolean a(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((a) list.get(i2)).h.b(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static qyc c(List list, w8e w8eVar, gdb.a aVar) {
        int i;
        e47.a aVar2 = new e47.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            a aVar3 = (a) list.get(i2);
            v8e v8eVar = aVar3.a;
            if ((v8eVar == null || !w8eVar.a.contains(v8eVar)) && ((i = aVar3.b) == -1 || !aVar.a(i))) {
                if (aVar3.i) {
                    aVar3 = new a(aVar3.a, aVar3.b, aVar3.c, aVar3.d, aVar3.e, aVar3.f, new Bundle(aVar3.g), false, aVar3.h);
                }
                aVar2.c(aVar3);
            } else {
                aVar2.c(aVar3);
            }
        }
        return aVar2.f();
    }

    public static a d(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(j);
        v8e v8eVarA = bundle2 == null ? null : v8e.a(bundle2);
        int i2 = bundle.getInt(k, -1);
        int i3 = bundle.getInt(l, 0);
        CharSequence charSequence = bundle.getCharSequence(m, "");
        Bundle bundle3 = bundle.getBundle(n);
        boolean z = i < 3 || bundle.getBoolean(o, true);
        Uri uri = (Uri) bundle.getParcelable(p);
        int i4 = bundle.getInt(q, 0);
        int[] intArray = bundle.getIntArray(r);
        C0056a c0056a = new C0056a(i4, i3);
        if (v8eVarA != null) {
            c0056a.d(v8eVarA);
        }
        if (i2 != -1) {
            c0056a.c(i2);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            c0056a.b(uri);
        }
        c0056a.f = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        c0056a.g = new Bundle(bundle3);
        c0056a.h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        ka2.l(intArray.length != 0);
        c0056a.i = intArray.length == 0 ? b47.a : new b47(Arrays.copyOf(intArray, intArray.length));
        return c0056a.a();
    }

    public static qyc e(boolean z, List list, boolean z2) {
        v8e v8eVar;
        v8e v8eVar2;
        int iB;
        if (list.isEmpty()) {
            e47.b bVar = e47.b;
            return qyc.e;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            a aVar = (a) list.get(i3);
            boolean z3 = aVar.i;
            b47 b47Var = aVar.h;
            if (z3 && (v8eVar2 = aVar.a) != null && v8eVar2.a == 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= b47Var.c() || (iB = b47Var.b(i4)) == 6) {
                        break;
                    }
                    if (z && i == -1 && iB == 2) {
                        i = i3;
                        break;
                    }
                    if (z2 && i2 == -1 && iB == 3) {
                        i2 = i3;
                        break;
                    }
                    i4++;
                }
            }
        }
        e47.b bVar2 = e47.b;
        e47.a aVar2 = new e47.a();
        if (i != -1) {
            aVar2.c(((a) list.get(i)).b(b47.d(2)));
        }
        if (i2 != -1) {
            aVar2.c(((a) list.get(i2)).b(b47.d(3)));
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            a aVar3 = (a) list.get(i5);
            if (aVar3.i && (v8eVar = aVar3.a) != null && v8eVar.a == 0 && i5 != i && i5 != i2 && aVar3.h.a()) {
                aVar2.c(aVar3.b(b47.d(6)));
            }
        }
        return aVar2.f();
    }

    public static qyc f(List list, gdb.a aVar, Bundle bundle) {
        if (list.isEmpty()) {
            e47.b bVar = e47.b;
            return qyc.e;
        }
        boolean zA = aVar.a.a(7, 6);
        boolean zA2 = aVar.a.a(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (zA || z) ? -1 : 0;
        int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
        e47.b bVar2 = e47.b;
        e47.a aVar2 = new e47.a();
        for (int i3 = 0; i3 < list.size(); i3++) {
            a aVar3 = (a) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    aVar2.c(aVar3.b(new b47(new int[]{2, 6})));
                } else {
                    aVar2.c(aVar3.b(new b47(new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                aVar2.c(aVar3.b(new b47(new int[]{3, 6})));
            } else {
                aVar2.c(aVar3.b(b47.d(6)));
            }
        }
        return aVar2.f();
    }

    public final a b(b47 b47Var) {
        if (this.h.equals(b47Var)) {
            return this;
        }
        return new a(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, b47Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && Objects.equals(this.e, aVar.e) && TextUtils.equals(this.f, aVar.f) && this.i == aVar.i && this.h.equals(aVar.h);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        v8e v8eVar = this.a;
        if (v8eVar != null) {
            bundle.putBundle(j, v8eVar.b());
        }
        int i = this.b;
        if (i != -1) {
            bundle.putInt(k, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(q, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(l, i3);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(m, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(n, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(p, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(o, z);
        }
        b47 b47Var = this.h;
        if (b47Var.c() == 1 && b47Var.b(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(r, b47Var.e());
        return bundle;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h);
    }

    /* JADX INFO: renamed from: androidx.media3.session.a$a, reason: collision with other inner class name */
    public static final class C0056a {
        public final int a;
        public v8e b;
        public int c;
        public int d;
        public Uri e;
        public CharSequence f;
        public Bundle g;
        public boolean h;
        public b47 i;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0056a(int i) {
            int i2;
            String str = a.j;
            switch (i) {
                case 57369:
                    i2 = R.drawable.media3_icon_album;
                    break;
                case 57370:
                    i2 = R.drawable.media3_icon_artist;
                    break;
                case 57372:
                    i2 = R.drawable.media3_icon_closed_captions;
                    break;
                case 57375:
                    i2 = R.drawable.media3_icon_fast_forward;
                    break;
                case 57376:
                    i2 = R.drawable.media3_icon_rewind;
                    break;
                case 57396:
                    i2 = R.drawable.media3_icon_pause;
                    break;
                case 57399:
                    i2 = R.drawable.media3_icon_play;
                    break;
                case 57403:
                    i2 = R.drawable.media3_icon_playlist_add;
                    break;
                case 57408:
                    i2 = R.drawable.media3_icon_repeat_all;
                    break;
                case 57409:
                    i2 = R.drawable.media3_icon_repeat_one;
                    break;
                case 57410:
                    i2 = R.drawable.media3_icon_skip_back;
                    break;
                case 57411:
                    i2 = R.drawable.media3_icon_shuffle_on;
                    break;
                case 57412:
                    i2 = R.drawable.media3_icon_next;
                    break;
                case 57413:
                    i2 = R.drawable.media3_icon_previous;
                    break;
                case 57415:
                    i2 = R.drawable.media3_icon_stop;
                    break;
                case 57416:
                    i2 = R.drawable.media3_icon_subtitles;
                    break;
                case 57421:
                    i2 = R.drawable.media3_icon_volume_down;
                    break;
                case 57423:
                    i2 = R.drawable.media3_icon_volume_off;
                    break;
                case 57424:
                    i2 = R.drawable.media3_icon_volume_up;
                    break;
                case 57430:
                    i2 = R.drawable.media3_icon_skip_forward_10;
                    break;
                case 57431:
                    i2 = R.drawable.media3_icon_skip_forward_30;
                    break;
                case 57432:
                    i2 = R.drawable.media3_icon_skip_forward_5;
                    break;
                case 57433:
                    i2 = R.drawable.media3_icon_skip_back_10;
                    break;
                case 57434:
                    i2 = R.drawable.media3_icon_skip_back_30;
                    break;
                case 57435:
                    i2 = R.drawable.media3_icon_skip_back_5;
                    break;
                case 57436:
                    i2 = R.drawable.media3_icon_queue_add;
                    break;
                case 57446:
                    i2 = R.drawable.media3_icon_queue_next;
                    break;
                case 57447:
                    i2 = R.drawable.media3_icon_queue_remove;
                    break;
                case 57448:
                    i2 = R.drawable.media3_icon_playback_speed;
                    break;
                case 57573:
                    i2 = R.drawable.media3_icon_feed;
                    break;
                case 57669:
                    i2 = R.drawable.media3_icon_plus;
                    break;
                case 57671:
                    i2 = R.drawable.media3_icon_plus_circle_unfilled;
                    break;
                case 57675:
                    i2 = R.drawable.media3_icon_block;
                    break;
                case 57683:
                    i2 = R.drawable.media3_icon_flag_unfilled;
                    break;
                case 57691:
                    i2 = R.drawable.media3_icon_minus;
                    break;
                case 58409:
                    i2 = R.drawable.media3_icon_quality;
                    break;
                case 58654:
                    i2 = R.drawable.media3_icon_radio;
                    break;
                case 58919:
                    i2 = R.drawable.media3_icon_sync;
                    break;
                case 59405:
                    i2 = R.drawable.media3_icon_share;
                    break;
                case 59448:
                    i2 = R.drawable.media3_icon_star_unfilled;
                    break;
                case 59494:
                    i2 = R.drawable.media3_icon_bookmark_unfilled;
                    break;
                case 59500:
                    i2 = R.drawable.media3_icon_check_circle_unfilled;
                    break;
                case 59517:
                    i2 = R.drawable.media3_icon_heart_unfilled;
                    break;
                case 59576:
                    i2 = R.drawable.media3_icon_settings;
                    break;
                case 59611:
                    i2 = R.drawable.media3_icon_thumb_down_unfilled;
                    break;
                case 59612:
                    i2 = R.drawable.media3_icon_thumb_up_unfilled;
                    break;
                case 60288:
                    i2 = R.drawable.media3_icon_playlist_remove;
                    break;
                case 61298:
                    i2 = R.drawable.media3_icon_subtitles_off;
                    break;
                case 61389:
                    i2 = R.drawable.media3_icon_playback_speed_1_0;
                    break;
                case 61512:
                    i2 = R.drawable.media3_icon_signal;
                    break;
                case 61916:
                    i2 = R.drawable.media3_icon_closed_captions_off;
                    break;
                case 62688:
                    i2 = R.drawable.media3_icon_playback_speed_1_5;
                    break;
                case 62689:
                    i2 = R.drawable.media3_icon_playback_speed_1_2;
                    break;
                case 62690:
                    i2 = R.drawable.media3_icon_playback_speed_0_5;
                    break;
                case 62699:
                    i2 = R.drawable.media3_icon_playback_speed_2_0;
                    break;
                case 63220:
                    i2 = R.drawable.media3_icon_skip_forward;
                    break;
                case 1040448:
                    i2 = R.drawable.media3_icon_repeat_off;
                    break;
                case 1040451:
                    i2 = R.drawable.media3_icon_shuffle_star;
                    break;
                case 1040452:
                    i2 = R.drawable.media3_icon_shuffle_off;
                    break;
                case 1040470:
                    i2 = R.drawable.media3_icon_skip_forward_15;
                    break;
                case 1040473:
                    i2 = R.drawable.media3_icon_skip_back_15;
                    break;
                case 1040711:
                    i2 = R.drawable.media3_icon_plus_circle_filled;
                    break;
                case 1040712:
                    i2 = R.drawable.media3_icon_minus_circle_filled;
                    break;
                case 1040713:
                    i2 = R.drawable.media3_icon_minus_circle_unfilled;
                    break;
                case 1040723:
                    i2 = R.drawable.media3_icon_flag_filled;
                    break;
                case 1042488:
                    i2 = R.drawable.media3_icon_star_filled;
                    break;
                case 1042534:
                    i2 = R.drawable.media3_icon_bookmark_filled;
                    break;
                case 1042540:
                    i2 = R.drawable.media3_icon_check_circle_filled;
                    break;
                case 1042557:
                    i2 = R.drawable.media3_icon_heart_filled;
                    break;
                case 1042651:
                    i2 = R.drawable.media3_icon_thumb_down_filled;
                    break;
                case 1042652:
                    i2 = R.drawable.media3_icon_thumb_up_filled;
                    break;
                case 1045728:
                    i2 = R.drawable.media3_icon_playback_speed_1_8;
                    break;
                case 1045730:
                    i2 = R.drawable.media3_icon_playback_speed_0_8;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            this(i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x008f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.media3.session.a a() {
            /*
                r11 = this;
                v8e r0 = r11.b
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L8
                r0 = r2
                goto L9
            L8:
                r0 = r1
            L9:
                int r3 = r11.c
                r4 = -1
                if (r3 != r4) goto L10
                r3 = r2
                goto L11
            L10:
                r3 = r1
            L11:
                if (r0 == r3) goto L14
                r1 = r2
            L14:
                java.lang.String r0 = "Exactly one of sessionCommand and playerCommand should be set"
                defpackage.ka2.p(r0, r1)
                b47 r0 = r11.i
                if (r0 != 0) goto L96
                int r0 = r11.c
                java.lang.String r1 = androidx.media3.session.a.j
                if (r0 == r2) goto L90
                r1 = 57399(0xe037, float:8.0433E-41)
                int r3 = r11.a
                if (r3 == r1) goto L90
                r1 = 57396(0xe034, float:8.0429E-41)
                if (r3 != r1) goto L30
                goto L90
            L30:
                r1 = 11
                if (r0 == r1) goto L8f
                r1 = 7
                if (r0 == r1) goto L8f
                r2 = 6
                if (r0 == r2) goto L8f
                r1 = 57413(0xe045, float:8.0453E-41)
                if (r3 == r1) goto L8f
                r1 = 57376(0xe020, float:8.0401E-41)
                if (r3 == r1) goto L8f
                r1 = 57410(0xe042, float:8.0449E-41)
                if (r3 == r1) goto L8f
                r1 = 57435(0xe05b, float:8.0484E-41)
                if (r3 == r1) goto L8f
                r1 = 57433(0xe059, float:8.0481E-41)
                if (r3 == r1) goto L8f
                r1 = 1040473(0xfe059, float:1.458013E-39)
                if (r3 == r1) goto L8f
                r1 = 57434(0xe05a, float:8.0482E-41)
                if (r3 != r1) goto L5e
                goto L8f
            L5e:
                r1 = 12
                if (r0 == r1) goto L8d
                r1 = 9
                if (r0 == r1) goto L8d
                r1 = 8
                if (r0 == r1) goto L8d
                r0 = 57412(0xe044, float:8.0451E-41)
                if (r3 == r0) goto L8d
                r0 = 57375(0xe01f, float:8.04E-41)
                if (r3 == r0) goto L8d
                r0 = 63220(0xf6f4, float:8.859E-41)
                if (r3 == r0) goto L8d
                r0 = 57432(0xe058, float:8.048E-41)
                if (r3 == r0) goto L8d
                r0 = 57430(0xe056, float:8.0477E-41)
                if (r3 == r0) goto L8d
                r0 = 1040470(0xfe056, float:1.458009E-39)
                if (r3 == r0) goto L8d
                r0 = 57431(0xe057, float:8.0478E-41)
                if (r3 != r0) goto L90
            L8d:
                r2 = 3
                goto L90
            L8f:
                r2 = 2
            L90:
                b47 r0 = defpackage.b47.d(r2)
                r11.i = r0
            L96:
                androidx.media3.session.a r1 = new androidx.media3.session.a
                v8e r2 = r11.b
                int r3 = r11.c
                int r5 = r11.d
                android.net.Uri r6 = r11.e
                java.lang.CharSequence r7 = r11.f
                android.os.Bundle r8 = r11.g
                boolean r9 = r11.h
                b47 r10 = r11.i
                int r4 = r11.a
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.a.C0056a.a():androidx.media3.session.a");
        }

        public final void b(Uri uri) {
            ka2.k("Only content or resource Uris are supported for CommandButton", Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"));
            this.e = uri;
        }

        public final void c(int i) {
            ka2.k("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", this.b == null);
            this.c = i;
        }

        public final void d(v8e v8eVar) {
            ka2.k("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", this.c == -1);
            this.b = v8eVar;
        }

        public C0056a(int i, int i2) {
            this.a = i;
            this.d = i2;
            this.f = "";
            this.g = Bundle.EMPTY;
            this.c = -1;
            this.h = true;
        }
    }
}
