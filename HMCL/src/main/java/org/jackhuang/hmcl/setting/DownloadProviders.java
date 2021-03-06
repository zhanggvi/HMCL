/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2018  huangyuhui <huanghongxun2008@126.com>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hmcl.setting;

import org.jackhuang.hmcl.download.BMCLAPIDownloadProvider;
import org.jackhuang.hmcl.download.CurseCDNDownloadProvider;
import org.jackhuang.hmcl.download.DownloadProvider;
import org.jackhuang.hmcl.download.MojangDownloadProvider;
import org.jackhuang.hmcl.util.Lang;

import java.util.List;

public final class DownloadProviders {
    private DownloadProviders() {}

    public static final List<DownloadProvider> DOWNLOAD_PROVIDERS = Lang.immutableListOf(new MojangDownloadProvider(), BMCLAPIDownloadProvider.INSTANCE, CurseCDNDownloadProvider.INSTANCE);

    public static DownloadProvider getDownloadProvider(int index) {
        return Lang.get(DOWNLOAD_PROVIDERS, index).orElse(DOWNLOAD_PROVIDERS.get(0));
    }
}
