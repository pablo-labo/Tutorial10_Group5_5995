package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;

/* JADX INFO: loaded from: classes3.dex */
public final class ap0 extends xb1<x0h, a> {
    public final y0h f;

    public static abstract class a implements uo6 {

        /* JADX INFO: renamed from: ap0$a$a, reason: collision with other inner class name */
        public static final class C0080a extends a {
            public final SavedJobsDto a;

            public C0080a(SavedJobsDto savedJobsDto) {
                savedJobsDto.getClass();
                this.a = savedJobsDto;
            }
        }

        public static final class b extends a {
            public final tr2 a;
            public final vv b;

            public b(tr2 tr2Var, vv vvVar) {
                this.a = tr2Var;
                this.b = vvVar;
            }
        }
    }

    public ap0(y0h y0hVar) {
        this.f = y0hVar;
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new x0h(0);
    }
}
