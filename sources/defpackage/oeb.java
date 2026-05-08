package defpackage;

import android.view.View;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oeb {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a V;
        public static final a W;
        public static final a X;
        public static final a Y;
        public static final a Z;
        public static final a a;
        public static final a a0;
        public static final a b;
        public static final a b0;
        public static final a c;
        public static final a c0;
        public static final a d;
        public static final a d0;
        public static final a e;
        public static final a e0;
        public static final a f;
        public static final a f0;
        public static final a g0;
        public static final /* synthetic */ a[] h0;

        static {
            a aVar = new a("CANCEL", 0);
            a = aVar;
            a aVar2 = new a("CANCEL_CAPTURE", 1);
            b = aVar2;
            a aVar3 = new a("CLICK", 2);
            c = aVar3;
            a aVar4 = new a("CLICK_CAPTURE", 3);
            d = aVar4;
            a aVar5 = new a("DOWN", 4);
            e = aVar5;
            a aVar6 = new a("DOWN_CAPTURE", 5);
            f = aVar6;
            a aVar7 = new a("ENTER", 6);
            V = aVar7;
            a aVar8 = new a("ENTER_CAPTURE", 7);
            W = aVar8;
            a aVar9 = new a("LEAVE", 8);
            X = aVar9;
            a aVar10 = new a("LEAVE_CAPTURE", 9);
            Y = aVar10;
            a aVar11 = new a("MOVE", 10);
            Z = aVar11;
            a aVar12 = new a("MOVE_CAPTURE", 11);
            a0 = aVar12;
            a aVar13 = new a("UP", 12);
            b0 = aVar13;
            a aVar14 = new a("UP_CAPTURE", 13);
            c0 = aVar14;
            a aVar15 = new a("OUT", 14);
            d0 = aVar15;
            a aVar16 = new a("OUT_CAPTURE", 15);
            e0 = aVar16;
            a aVar17 = new a("OVER", 16);
            f0 = aVar17;
            a aVar18 = new a("OVER_CAPTURE", 17);
            g0 = aVar18;
            h0 = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h0.clone();
        }
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        return iHashCode != -1780335505 ? iHashCode != -1065042973 ? iHashCode == 1343400710 && str.equals("topPointerOut") : str.equals("topPointerUp") : str.equals("topPointerLeave");
    }

    public static final boolean b(View view, a aVar) {
        int iOrdinal;
        if (view != null && (iOrdinal = aVar.ordinal()) != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 12 && iOrdinal != 13) {
            Object tag = view.getTag(R.id.pointer_events);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num == null || (num.intValue() & (1 << aVar.ordinal())) == 0) {
                return false;
            }
        }
        return true;
    }
}
