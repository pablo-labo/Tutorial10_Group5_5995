package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class FileAsset$uniqueFilename$2 extends mj8 implements gu5<String> {
    final /* synthetic */ FileAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAsset$uniqueFilename$2(FileAsset fileAsset) {
        super(0);
        this.this$0 = fileAsset;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        FileAsset fileAsset = this.this$0;
        return fileAsset.cppUniqueFilename(fileAsset.getCppPointer());
    }
}
