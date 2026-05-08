package app.rive.runtime.kotlin;

import android.content.Context;
import app.rive.runtime.kotlin.core.Rive;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.j6g;
import defpackage.nd7;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/rive/runtime/kotlin/RiveInitializer;", "Lnd7;", "Lj6g;", "<init>", "()V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class RiveInitializer implements nd7<j6g> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) throws Throwable {
        context.getClass();
        Rive.init$default(Rive.INSTANCE, context, null, 2, null);
    }

    @Override // defpackage.nd7
    public List<Class<? extends nd7<?>>> dependencies() {
        return zr4.a;
    }

    @Override // defpackage.nd7
    public /* bridge */ /* synthetic */ j6g create(Context context) throws Throwable {
        create2(context);
        return j6g.a;
    }
}
