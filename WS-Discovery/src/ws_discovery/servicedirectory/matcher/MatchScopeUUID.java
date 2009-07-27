/*
MatchScopeUUID.java

Copyright (C) 2008-2009 Magnus Skjegstad

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package ws_discovery.servicedirectory.matcher;

import ws_discovery.servicedirectory.WsDiscoveryService;
import ws_discovery.xml.jaxb_generated.ScopesType;

/**
 * Match scope against target service using the UUID algorithm.
 * See the WS-Discovery specification or {@link MatchBy} for details.
 * @author Magnus Skjegstad
 */
public class MatchScopeUUID implements IMatchScope {
    /**
     * Match scope against target service using the UUID algorithm.
     * See the WS-Discovery specification or {@link MatchBy} for details.
     * @param target Target service. 
     * @param probeScopes Scopes to probe for.
     * @return True on success, false on failure.
     */
    public boolean matchScope(WsDiscoveryService target, ScopesType probeScopes) {
        throw new UnsupportedOperationException("Match by UUID not supported yet.");
    }

}
