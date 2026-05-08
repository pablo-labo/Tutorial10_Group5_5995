package defpackage;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import defpackage.sp7;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf9d;", "Lw0g;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f9d extends w0g {
    public Uri g0;
    public String h0;

    @uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.resumepreview.ResumePreviewOptionsBottomSheetFragment$CustomModalContents$3$1$1", f = "ResumePreviewOptionsBottomSheetFragment.kt", l = {97}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Uri $destinationUri;
        int label;

        /* JADX INFO: renamed from: f9d$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.resumepreview.ResumePreviewOptionsBottomSheetFragment$CustomModalContents$3$1$1$1", f = "ResumePreviewOptionsBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
        public static final class C0228a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ Uri $destinationUri;
            int label;
            final /* synthetic */ f9d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0228a(f9d f9dVar, Uri uri, lu2<? super C0228a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = f9dVar;
                this.$destinationUri = uri;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0228a(this.this$0, this.$destinationUri, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0228a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws IOException {
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                ContentResolver contentResolver = this.this$0.requireContext().getContentResolver();
                contentResolver.getClass();
                Uri uri = this.this$0.g0;
                if (uri == null) {
                    wl7.g("sourceUri");
                    throw null;
                }
                Uri uri2 = this.$destinationUri;
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new IOException("Could not open source document");
                    }
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
                    try {
                        if (outputStreamOpenOutputStream == null) {
                            throw new IOException("Could not open destination for writing");
                        }
                        wg2.u(inputStreamOpenInputStream, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return j6g.a;
                    } finally {
                    }
                } finally {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$destinationUri = uri;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return f9d.this.new a(this.$destinationUri, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            r7d.b(obj);
                            f9d.this.P(true);
                            no3 no3Var = no3.c;
                            C0228a c0228a = new C0228a(f9d.this, this.$destinationUri, null);
                            this.label = 1;
                            Object objQ0 = u63.q0(no3Var, c0228a, this);
                            g13 g13Var = g13.a;
                            if (objQ0 == g13Var) {
                                return g13Var;
                            }
                        } else {
                            if (i != 1) {
                                r6.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r7d.b(obj);
                        }
                        f9d.this.close();
                    } catch (IOException e) {
                        ((np7) cr8.p(np7.class)).c("ResumePreviewOptionsBottomSheetFragment", "Save As failed (IO)", false, e);
                    }
                } catch (SecurityException e2) {
                    ((np7) cr8.p(np7.class)).c("ResumePreviewOptionsBottomSheetFragment", "Save As failed (permission)", false, e2);
                }
                return j6g.a;
            } finally {
                f9d.this.P(false);
            }
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, b bVar) {
        c cVarH = bVar.h(-661797028);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Uri uri = this.g0;
            if (uri == null) {
                wl7.g("sourceUri");
                throw null;
            }
            String str = this.h0;
            if (str == null) {
                wl7.g("fileName");
                throw null;
            }
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new ye(this, 19);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = new cp0(16);
                cVarH.p(objV2);
            }
            gu5 gu5Var2 = (gu5) objV2;
            boolean zX2 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new ma(this, 14);
                cVarH.p(objV3);
            }
            h9d.a(uri, str, gu5Var, gu5Var2, (Function1) objV3, cVarH, 3072);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xd(this, i, 18);
        }
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l5.q("ResumePreviewOptionsBottomSheetFragment requires arguments");
            return;
        }
        String string = arguments.getString("KEY_URI");
        if (string == null) {
            l5.q("Missing required argument: KEY_URI");
            return;
        }
        String string2 = arguments.getString("KEY_FILE_NAME");
        if (string2 == null) {
            l5.q("Missing required argument: KEY_FILE_NAME");
        } else {
            this.g0 = Uri.parse(string);
            this.h0 = string2;
        }
    }

    @Override // defpackage.w0g, androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        ((tp7) cr8.p(tp7.class)).b(new sp7.b("ResumePreviewOptionsBottomSheetFragment", "resumePreviewOptionsSheet", null, null, 12));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        q6.n("ResumePreviewOptionsBottomSheetFragment", null, null, 6, (tp7) cr8.p(tp7.class));
    }
}
