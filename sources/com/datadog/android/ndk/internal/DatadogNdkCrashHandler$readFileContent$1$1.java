package com.datadog.android.ndk.internal;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.u40;
import defpackage.ut0;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogNdkCrashHandler$readFileContent$1$1 extends mj8 implements gu5<String> {
    final /* synthetic */ byte[] $content;
    final /* synthetic */ File $file;
    final /* synthetic */ String $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogNdkCrashHandler$readFileContent$1$1(File file, String str, byte[] bArr) {
        super(0);
        this.$file = file;
        this.$it = str;
        this.$content = bArr;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        String name = this.$file.getName();
        String str = this.$it;
        String strS0 = ut0.s0(this.$content, ",", null, 62);
        StringBuilder sbF = u40.f("Decoded file (", name, ") content contains NULL character, file content={", str, "}, raw_bytes=");
        sbF.append(strS0);
        return sbF.toString();
    }
}
