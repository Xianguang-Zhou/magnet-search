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
package org.zxg.search.magnet.search.crawler;

/**
 *
 * @author Xianguang Zhou <xianguang.zhou@outlook.com>
 */
public class Crawler extends org.zxg.network.dhtcrawler.Crawler {

    public Crawler(String host, int port) {
        super(host, port, infoHash -> {

        });
    }

    public static void main(String[] args) throws Exception {
        Crawler clawer = new Crawler("0.0.0.0", 6881);
        clawer.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> clawer.stop()));
        clawer.join();
    }
}
