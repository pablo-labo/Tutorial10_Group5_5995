package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes.dex */
public final class uf6 {
    public static int a(HandwritingGesture handwritingGesture, ir irVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        irVar.invoke(new kc2(fallbackText, 1));
        return 5;
    }

    public static void b(long j, le0 le0Var, boolean z, ir irVar) {
        if (z) {
            int i = kjf.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(le0Var, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < le0Var.b.length() ? Character.codePointAt(le0Var, iCharCount2) : 10;
            if (wf6.i(iCodePointBefore) && (wf6.h(iCodePointAt) || wf6.g(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(le0Var, iCharCount);
                    }
                } while (wf6.i(iCodePointBefore));
                j = cr8.c(iCharCount, iCharCount2);
            } else if (wf6.i(iCodePointAt) && (wf6.h(iCodePointBefore) || wf6.g(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == le0Var.b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(le0Var, iCharCount2);
                    }
                } while (wf6.i(iCodePointAt));
                j = cr8.c(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        irVar.invoke(new vf6(new qh4[]{new sae(i2, i2), new tx3(kjf.d(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(defpackage.lu8 r16, android.view.inputmethod.HandwritingGesture r17, defpackage.rgf r18, defpackage.opg r19, defpackage.ir r20) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf6.c(lu8, android.view.inputmethod.HandwritingGesture, rgf, opg, ir):int");
    }

    public static boolean d(lu8 lu8Var, PreviewableHandwritingGesture previewableHandwritingGesture, final rgf rgfVar, CancellationSignal cancellationSignal) {
        mif mifVar;
        kif kifVar;
        le0 le0Var = lu8Var.j;
        if (le0Var != null) {
            nif nifVarD = lu8Var.d();
            if (le0Var.equals((nifVarD == null || (mifVar = nifVarD.a) == null || (kifVar = mifVar.a) == null) ? null : kifVar.a)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                mf6 mf6Var = mf6.a;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (rgfVar != null) {
                        long jF = wf6.f(lu8Var, wab.C(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        lu8 lu8Var2 = rgfVar.d;
                        if (lu8Var2 != null) {
                            lu8Var2.f(jF);
                        }
                        lu8 lu8Var3 = rgfVar.d;
                        if (lu8Var3 != null) {
                            lu8Var3.e(kjf.b);
                        }
                        if (!kjf.c(jF)) {
                            rgfVar.s(false);
                            rgfVar.p(mf6Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (rgfVar != null) {
                        long jF2 = wf6.f(lu8Var, wab.C(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        lu8 lu8Var4 = rgfVar.d;
                        if (lu8Var4 != null) {
                            lu8Var4.e(jF2);
                        }
                        lu8 lu8Var5 = rgfVar.d;
                        if (lu8Var5 != null) {
                            lu8Var5.f(kjf.b);
                        }
                        if (!kjf.c(jF2)) {
                            rgfVar.s(false);
                            rgfVar.p(mf6Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (rgfVar != null) {
                        long jB = wf6.b(lu8Var, wab.C(selectRangeGesture.getSelectionStartArea()), wab.C(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        lu8 lu8Var6 = rgfVar.d;
                        if (lu8Var6 != null) {
                            lu8Var6.f(jB);
                        }
                        lu8 lu8Var7 = rgfVar.d;
                        if (lu8Var7 != null) {
                            lu8Var7.e(kjf.b);
                        }
                        if (!kjf.c(jB)) {
                            rgfVar.s(false);
                            rgfVar.p(mf6Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (rgfVar != null) {
                        long jB2 = wf6.b(lu8Var, wab.C(deleteRangeGesture.getDeletionStartArea()), wab.C(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        lu8 lu8Var8 = rgfVar.d;
                        if (lu8Var8 != null) {
                            lu8Var8.e(jB2);
                        }
                        lu8 lu8Var9 = rgfVar.d;
                        if (lu8Var9 != null) {
                            lu8Var9.f(kjf.b);
                        }
                        if (!kjf.c(jB2)) {
                            rgfVar.s(false);
                            rgfVar.p(mf6Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: tf6
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            rgf rgfVar2 = rgfVar;
                            if (rgfVar2 != null) {
                                lu8 lu8Var10 = rgfVar2.d;
                                if (lu8Var10 != null) {
                                    lu8Var10.e(kjf.b);
                                }
                                lu8 lu8Var11 = rgfVar2.d;
                                if (lu8Var11 != null) {
                                    lu8Var11.f(kjf.b);
                                }
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
    }
}
