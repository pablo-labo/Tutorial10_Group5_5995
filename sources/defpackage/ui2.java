package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ui2 {
    public static final ah2 a;

    public static final class a implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class b implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarF = g.f(e.a.b, 1.0f);
                bVar2.L(1849434622);
                Object objV = bVar2.v();
                if (objV == b.a.a) {
                    objV = new cn0(2);
                    bVar2.p(objV);
                }
                bVar2.F();
                gt6.j("Button", (gu5) objV, eVarF, null, false, false, null, null, null, bVar2, 438, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            }
            return j6g.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final c a = new c();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class d implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class e implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final e a = new e();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class f implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public static final f a = new f();

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarF = g.f(e.a.b, 1.0f);
                bVar2.L(1849434622);
                Object objV = bVar2.v();
                if (objV == b.a.a) {
                    objV = new oz0(2);
                    bVar2.p(objV);
                }
                bVar2.F();
                gt6.h("Button", (gu5) objV, eVarF, null, false, false, null, null, null, bVar2, 438, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
            }
            return j6g.a;
        }
    }

    static {
        new ah2(64809743, e.a, false);
        a = new ah2(1358053953, c.a, false);
        new ah2(53607404, d.a, false);
        new ah2(-1570897634, a.a, false);
        new ah2(-1764119213, b.a, false);
        new ah2(771488212, f.a, false);
    }
}
