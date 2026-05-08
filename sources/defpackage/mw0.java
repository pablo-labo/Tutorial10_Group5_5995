package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.sp7;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class mw0 {

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.AttachmentBottomSheetKt$AttachmentBottomSheet$1$1", f = "AttachmentBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $bottomSheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hee heeVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$bottomSheetState = heeVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$bottomSheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            if (this.$bottomSheetState.c()) {
                q6.n("messagingAttachmentBanner", null, null, 6, (tp7) cr8.p(tp7.class));
            }
            return j6g.a;
        }
    }

    public static final void a(final hee heeVar, final gu5<j6g> gu5Var, final Function1<? super Uri, j6g> function1, final gu5<j6g> gu5Var2, final gu5<j6g> gu5Var3, b bVar, final int i) {
        heeVar.getClass();
        gu5Var.getClass();
        function1.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(-2110775722);
        int i2 = i | (cVarH.K(heeVar) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(function1) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarH.x(gu5Var3) ? 16384 : 8192);
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            Boolean boolValueOf = Boolean.valueOf(heeVar.c());
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new a(heeVar, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV);
            final Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            t8 t8Var = new t8();
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new jw0(function1, 0);
                cVarH.p(objV2);
            }
            ra9 ra9VarL = ypd.L(t8Var, (Function1) objV2, cVarH);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = r.f(Uri.EMPTY);
                cVarH.p(objV3);
            }
            final g4a g4aVar = (g4a) objV3;
            y8 y8Var = new y8();
            boolean z3 = i4 == 256;
            Object objV4 = cVarH.v();
            if (z3 || objV4 == c0020a) {
                objV4 = new is(function1, g4aVar, 1);
                cVarH.p(objV4);
            }
            final ra9 ra9VarL2 = ypd.L(y8Var, (Function1) objV4, cVarH);
            v8 v8Var = new v8();
            boolean zX = cVarH.x(context) | cVarH.x(ra9VarL2) | ((i2 & 57344) == 16384);
            Object objV5 = cVarH.v();
            if (zX || objV5 == c0020a) {
                objV5 = new Function1() { // from class: kw0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Uri uriD;
                        if (((Boolean) obj).booleanValue()) {
                            String str = "IMG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
                            Context context2 = context;
                            context2.getClass();
                            try {
                                File fileCreateTempFile = File.createTempFile(str, ".jpg", context2.getCacheDir());
                                fileCreateTempFile.createNewFile();
                                uriD = FileProvider.d(context2.getApplicationContext(), context2.getPackageName(), fileCreateTempFile);
                                uriD.getClass();
                            } catch (IOException e) {
                                ArrayList arrayList = lz2.a;
                                lz2.b("FilesUtil", "Could not create tmp file for camera", false, e);
                                uriD = Uri.EMPTY;
                                uriD.getClass();
                            }
                            g4a g4aVar2 = g4aVar;
                            g4aVar2.setValue(uriD);
                            Uri uri = (Uri) g4aVar2.getValue();
                            uri.getClass();
                            ra9VarL2.a(uri);
                        } else {
                            gu5Var3.invoke();
                            ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingAttachmentBanner", "denyCameraPermission", null, null, 12));
                        }
                        return j6g.a;
                    }
                };
                cVarH.p(objV5);
            }
            ra9 ra9VarL3 = ypd.L(v8Var, (Function1) objV5, cVarH);
            String strI = ak2.I(R.string.messaging_attachments, cVarH);
            ax6 ax6Var = new ax6(ak2.I(R.string.messaging_attachment_source_files, cVarH), gu5Var, fv6.A3, false, false, 500);
            String strI2 = ak2.I(R.string.messaging_attachment_source_photos, cVarH);
            fv6 fv6Var = fv6.C3;
            boolean zX2 = cVarH.x(ra9VarL);
            Object objV6 = cVarH.v();
            if (zX2 || objV6 == c0020a) {
                objV6 = new oe(ra9VarL, 2);
                cVarH.p(objV6);
            }
            ax6 ax6Var2 = new ax6(strI2, (gu5) objV6, fv6Var, false, false, 500);
            String strI3 = ak2.I(R.string.messaging_attachment_source_camera, cVarH);
            fv6 fv6Var2 = fv6.i1;
            boolean zX3 = cVarH.x(ra9VarL3);
            Object objV7 = cVarH.v();
            if (zX3 || objV7 == c0020a) {
                objV7 = new zh(ra9VarL3, 3);
                cVarH.p(objV7);
            }
            ok1.a(heeVar, strI, u63.a0(ax6Var, ax6Var2, new ax6(strI3, (gu5) objV7, fv6Var2, false, false, 500)), "AttachmentBottomSheet", gu5Var2, cVarH, i3 | 3584 | ((i2 << 3) & 57344));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(gu5Var, function1, gu5Var2, gu5Var3, i) { // from class: lw0
                public final /* synthetic */ gu5 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;
                public final /* synthetic */ gu5 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    mw0.a(this.a, this.b, this.c, this.d, this.e, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
