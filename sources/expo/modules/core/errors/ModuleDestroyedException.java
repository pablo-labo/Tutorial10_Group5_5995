package expo.modules.core.errors;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/core/errors/ModuleDestroyedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModuleDestroyedException extends CancellationException {
    public ModuleDestroyedException() {
        super("Module destroyed. All coroutines are cancelled.");
    }
}
