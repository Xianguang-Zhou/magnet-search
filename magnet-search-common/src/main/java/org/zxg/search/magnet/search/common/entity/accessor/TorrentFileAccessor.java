/*
 * Copyright (C) 2014 Xianguang Zhou <xianguang.zhou@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.zxg.search.magnet.search.common.entity.accessor;

import com.datastax.driver.mapping.Result;
import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Param;
import com.datastax.driver.mapping.annotations.Query;
import org.zxg.search.magnet.search.common.entity.TorrentFile;

/**
 *
 * @author Xianguang Zhou <xianguang.zhou@outlook.com>
 */
@Accessor
public interface TorrentFileAccessor {

    @Query("select * from magnet_search.torrent_file where info_hash=:infoHash and file_path=:filePath")
    TorrentFile getByInfoHashAndFilePath(@Param("infoHash") String infoHash, @Param("filePath") String filePath);

    @Query("select * from magnet_search.torrent_file where info_hash=:infoHash")
    Result<TorrentFile> findByInfoHash(@Param("infoHash") String infoHash);
}
