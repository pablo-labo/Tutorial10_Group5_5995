package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.f;
import com.reactcommunity.rndatetimepicker.TimePickerModule;

/* JADX INFO: loaded from: classes3.dex */
public class lhc extends f {
    public qcc f0;
    public TimePickerModule.a g0;
    public TimePickerModule.a h0;
    public TimePickerModule.a i0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // androidx.fragment.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog H(android.os.Bundle r15) {
        /*
            r14 = this;
            android.os.Bundle r15 = r14.getArguments()
            androidx.fragment.app.g r1 = r14.getActivity()
            com.reactcommunity.rndatetimepicker.TimePickerModule$a r2 = r14.g0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            if (r15 == 0) goto L1f
            java.lang.String r3 = "value"
            boolean r4 = r15.containsKey(r3)
            if (r4 == 0) goto L1f
            long r3 = r15.getLong(r3)
            r0.setTimeInMillis(r3)
        L1f:
            java.util.TimeZone r3 = defpackage.mc2.c(r15)
            r0.setTimeZone(r3)
            r3 = 11
            int r3 = r0.get(r3)
            r4 = 12
            int r4 = r0.get(r4)
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r1)
            if (r15 == 0) goto L42
            java.lang.String r0 = "is24Hour"
            boolean r5 = android.text.format.DateFormat.is24HourFormat(r1)
            boolean r0 = r15.getBoolean(r0, r5)
        L42:
            r6 = r0
            r9 = 1
            if (r15 == 0) goto L5f
            java.lang.String r0 = "minuteInterval"
            int r5 = r15.getInt(r0)
            int r7 = defpackage.cu9.W
            if (r5 < r9) goto L5f
            r7 = 30
            if (r5 > r7) goto L5f
            r7 = 60
            int r7 = r7 % r5
            if (r7 != 0) goto L5f
            int r0 = r15.getInt(r0)
            r5 = r0
            goto L60
        L5f:
            r5 = r9
        L60:
            r10 = 0
            java.lang.String r11 = "display"
            mhc r12 = defpackage.mhc.b
            if (r15 == 0) goto L7d
            java.lang.String r0 = r15.getString(r11, r10)
            if (r0 == 0) goto L7d
            java.lang.String r0 = r15.getString(r11)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r0 = r0.toUpperCase(r7)
            mhc r0 = defpackage.mhc.valueOf(r0)
            r7 = r0
            goto L7e
        L7d:
            r7 = r12
        L7e:
            mhc r13 = defpackage.mhc.a
            if (r7 != r13) goto L89
            qcc r0 = new qcc
            r8 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L8e
        L89:
            qcc r0 = new qcc
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L8e:
            if (r15 == 0) goto Lb7
            com.reactcommunity.rndatetimepicker.TimePickerModule$a r2 = r14.i0
            defpackage.mc2.d(r15, r0, r2)
            if (r1 == 0) goto Lb7
            java.lang.String r2 = r15.getString(r11, r10)
            if (r2 == 0) goto Lab
            java.lang.String r2 = r15.getString(r11)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r3)
            mhc r12 = defpackage.mhc.valueOf(r2)
        Lab:
            if (r12 != r13) goto Lae
            goto Laf
        Lae:
            r9 = 0
        Laf:
            lc2 r2 = new lc2
            r2.<init>(r0, r1, r15, r9)
            r0.setOnShowListener(r2)
        Lb7:
            r14.f0 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhc.H(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        TimePickerModule.a aVar = this.h0;
        if (aVar != null) {
            aVar.onDismiss(dialogInterface);
        }
    }
}
