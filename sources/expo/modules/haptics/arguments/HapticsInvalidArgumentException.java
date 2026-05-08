package expo.modules.haptics.arguments;

import expo.modules.core.errors.CodedException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/haptics/arguments/HapticsInvalidArgumentException;", "Lexpo/modules/core/errors/CodedException;", "expo-haptics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HapticsInvalidArgumentException extends CodedException {
    @Override // expo.modules.core.errors.CodedException
    public final String a() {
        return "E_HAPTICS_INVALID_ARGUMENT";
    }
}
