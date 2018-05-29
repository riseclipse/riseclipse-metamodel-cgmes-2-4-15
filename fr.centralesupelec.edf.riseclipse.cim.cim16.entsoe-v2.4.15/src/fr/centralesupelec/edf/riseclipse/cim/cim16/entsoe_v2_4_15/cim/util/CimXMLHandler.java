/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim16.entsoe_v2_4_15.cim.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class CimXMLHandler extends fr.centralesupelec.edf.riseclipse.cim.cim16.util.CimXMLHandler {

    public CimXMLHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( xmiResource, helper, options );
    }

    @Override
    protected EPackage getPackageForURI( String uriString ) {
        if( CimConstants.entsoe_URI.equals( uriString )) {
            return super.getPackageForURI( CimConstants.cimURI );
        }
        return super.getPackageForURI( uriString );
    }

    // This method needs to test for the entsoe URI
    @Override
    protected boolean setEnumValue( EObject object, EStructuralFeature feature, String resource ) {
        if( resource.startsWith( CimConstants.entsoe_URISharp ) ) {
            int enumNameLength = feature.getEType().getName().length();
            // do not call fr.centralesupelec.riseclipse.cim.util.cimxml.CimXMLHandler.setFeatureValue to avoid infinite recursion
            // call instead org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler.setFeatureValue
            // We use the fact that SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object ) call
            // SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object, -1 )
            super.setFeatureValue( object, feature,
                  resource.substring( CimConstants.entsoe_URISharp.length() + enumNameLength + 1 ), -1 );
            return true;
        }
        return super.setEnumValue( object, feature, resource );
    }

}
