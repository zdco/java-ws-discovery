/*
WsDiscoveryScopesType.java

Copyright (C) 2009 Magnus Skjegstad

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

package com.ms.wsdiscovery.datatypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;

/**
 * Generic type for storing JAXB-generated ScopesType
 *
 * @author Magnus Skjegstad
 */
public class WsDiscoveryScopesType {
    protected String matchBy;
    protected List<String> value;
    protected Map<QName, String> otherAttributes;

    public WsDiscoveryScopesType(String matchBy, List<String> value, Map<QName, String> otherAttributes) {
        this.matchBy = matchBy;
        this.value = value;
        this.otherAttributes = otherAttributes;
    }

    public WsDiscoveryScopesType() {
    }

    public void setMatchBy(String matchBy) {
        this.matchBy = matchBy;
    }
        
    public String getMatchBy() {
        return matchBy;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return value;
    }
}
